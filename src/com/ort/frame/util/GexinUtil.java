package com.ort.frame.util;

import java.util.ArrayList;
import java.util.List;

import com.gexin.rp.sdk.base.IAliasResult;
import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.ListMessage;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.exceptions.RequestException;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.AbstractTemplate;
import com.gexin.rp.sdk.template.LinkTemplate;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.TransmissionTemplate;

/**
 * 个推工具类
 * @author 庄家利
 * 2017-03-28
 *
 */
public final class GexinUtil{
	public static final String appId = "vd82ckxbYR8UJTgLKGvXn";
	public static final String appKey = "zcgh0gdxtC9fOYzzGEGHg";
	public static final String masterSecret = "keKgR5zGYY8vshyXtnfBj7";   
	public static final String AppSecret = "QRABsTgIqp9t9qZSKP3L82"; //待用
    static String host = "https://api.getui.com/apiex.htm";
    
//    public static final String appId = "YyqbkDZBIBAy4QUChk4AI7";
//	public static final String appKey = "wLseI1Yu088rNdcG7IkQE2";
//	public static final String masterSecret = "3hfBnvKJitADrCQmaNyku6";   
//	public static final String CID = "95f9b147f69a63ad8066035a2d28c87b";
//    static String host = "https://api.getui.com/apiex.htm";
 
    public static void main(String[] args) throws Exception {
       //System.out.println(bindAlias("854713712", CID));
       boolean result = TransmissionPushMessageToSingle("C82D648B0F53504096A8AF000D7AD04","dadwadadwa");
       System.out.println("推送结果:"+result);
    }
    
    /**
     * 绑定用户别名
     * @param Alias 别名
     * @param CID 个推ID
     * @return
     */
    public static boolean bindAlias(String Alias, String CID){
    	IGtPush push = new IGtPush(host, appKey, masterSecret);
    	IAliasResult bindSCid = push.bindAlias(appId, Alias, CID);
    	return bindSCid.getResult();
    }
    
    /**
     * 根据别名获取用户ID
     * @param Alias 别名
     * @return
     */
    public static List<String> queryClientId(String Alias){
    	 IGtPush push = new IGtPush(host, appKey, masterSecret);
         IAliasResult queryClient = push.queryClientId(appId, Alias);
         return queryClient.getClientIdList();
    }
    
    
    /**
     * 安静Link个推
     * @param alias
     * @param title
     * @param content
     * @param icon 通知栏图标
     * @param logoUrl 通知栏网络图标
     * @param link 打开的网页地址
     * @return
     */
    public static boolean LinkPushMessageToSingle(String alias, String title, String content, String icon, String logoUrl, 
    		 String link){
    	return LinkPushMessageToSingle(alias,title,content,icon,logoUrl,false,false,false,link);
    }
    
    /**
     * Link个推
     * @param alias
     * @param title
     * @param content
     * @param icon 通知栏图标
     * @param logoUrl 通知栏网络图标
     * @param isRing 响铃
     * @param isVibrate 震动
     * @param isClearable 可清除
     * @param link 打开的网页地址
     * @return
     */
    public static boolean LinkPushMessageToSingle(String alias, String title, String content, String icon, String logoUrl, 
    		boolean isRing, boolean isVibrate, boolean isClearable, String link){
    	LinkTemplate linkTemp = linkTemplateDemo(title,content,icon,logoUrl,isRing,isVibrate,isClearable,link);
    	return pushMessageToSingle(linkTemp, alias);
    }
    
    /**
     * 传透个推
     * @param alias
     * @param param 传透内容
     * @return
     */
    public static boolean TransmissionPushMessageToSingle(String alias, Object param){
    	TransmissionTemplate template = TransmissionTemplateDemo(JsonUtil.getJsonString4JavaPOJO(param));
    	return pushMessageToSingle(template, alias);
    }
    
    /**
     * 传透通知群推
     * @param alias
     * @param title
     * @param content
     * @param icon 通知栏图标
     * @param logoUrl 通知栏网络图标
     * @param isRing 响铃
     * @param isVibrate 震动
     * @param isClearable 可清除
     * @param Transmission 1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启
     * @param TransmissionContent 传透内容
     * @return
     */
    public static String TransmissionPushMessageToSome(List<String> aliases, String param){
    	TransmissionTemplate template = TransmissionTemplateDemo(JsonUtil.getJsonString4JavaPOJO(param));
    	return pushMessageToSome(template, aliases);
    }
    
    /**
     * 单推
     * @param alias 推送用户别名
     * @param template 模板类型
     * @return
     */
    private static boolean pushMessageToSingle(AbstractTemplate template, String alias){
    	// https连接
        IGtPush push = new IGtPush(appKey, masterSecret, true);
        // 此处true为https域名，false为http，默认为false。Java语言推荐使用此方�?
        // IGtPush push = new IGtPush(host, appkey, master);
        // host为域名，根据域名区分是http协议/https协议
        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可�?
        message.setOfflineExpireTime(24 * 3600 * 1000);
        message.setData(template);
        message.setPushNetWorkType(0); // 可�?�，判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境�?
        Target target = new Target();
        target.setAppId(appId);
        target.setAlias(alias);
        // 用户别名推�?�，cid和用户别名只�?2者�?�其�?
        // String alias = "�?";
        // target.setAlias(alias);
        IPushResult ret = null;
        try {
            ret = push.pushMessageToSingle(message, target);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToSingle(message, target, e.getRequestId());
        }
        if (ret != null) {
            System.out.println(ret.getResponse().toString());
            return true;
        } else {
            System.out.println("服务器响应异常");
            return false;
        }
    }
    
    /**
     * 群推
     * @param alias 推送用户别名
     * @param template 模板类型
     * @return
     */
    private static String pushMessageToSome(AbstractTemplate template, List<String> aliases){
    	// 配置返回每个用户返回用户状�?�，可�??
        System.setProperty("gexin.rp.sdk.pushlist.needDetails", "true");
        IGtPush push = new IGtPush(host, appKey, masterSecret);
        // 通知透传模板
        ListMessage message = new ListMessage();
        message.setData(template);
        // 设置消息离线，并设置离线时间
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可�?
        message.setOfflineExpireTime(24 * 1000 * 3600);
        // 配置推�?�目�?
        List targets = new ArrayList();
        for(String alias:aliases){
        	Target target = new Target();
            target.setAppId(appId);
            //target1.setClientId(CID1);
            target.setAlias(alias);
            targets.add(target);
        }
        // taskId用于在推送时去查找对应的message
        String taskId = push.getContentId(message);
        IPushResult ret = push.pushMessageToList(taskId, targets);
        return ret.getResponse().toString();
    }
    
    /**
     * Link推送模板
     * @param title
     * @param content
     * @param icon 通知栏图标
     * @param logoUrl 通知栏网络图标
     * @param isRing 响铃
     * @param isVibrate 震动
     * @param isClearable 可清除
     * @param link 打开的网页地址
     * @return
     */
    private static LinkTemplate linkTemplateDemo(String title, String content, String icon, String logoUrl, 
    		boolean isRing, boolean isVibrate, boolean isClearable, String link) {
        LinkTemplate template = new LinkTemplate();
        // 设置APPID与APPKEY
        template.setAppId(appId);
        template.setAppkey(appKey);
        // 设置通知栏标题与内容
        template.setTitle(title);
        template.setText(content);
        // 配置通知栏图标
        template.setLogo(icon);
        // 配置通知栏网络图标，填写图标URL地址
        template.setLogoUrl(logoUrl);
        // 设置通知是否响铃，震动，或全部可清除
        template.setIsRing(isRing);
        template.setIsVibrate(isVibrate);
        template.setIsClearable(isClearable);
        // 设置打开的网页地址
        template.setUrl(link);
        return template;
    }
    
    /**
     * 传透通知推送模板
     * @param title
     * @param content
     * @param icon 通知栏图标
     * @param logoUrl 通知栏网络图标
     * @param isRing 响铃
     * @param isVibrate 震动
     * @param isClearable 可清除
     * @param Transmission 1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启
     * @param TransmissionContent 传透内容
     * @return
     */
    private static NotificationTemplate notificationTemplateDemo(String title, String content, String icon, String logoUrl, 
    		boolean isRing, boolean isVibrate, boolean isClearable,int Transmission, String TransmissionContent) {
        NotificationTemplate template = new NotificationTemplate();
        // 设置APPID与APPKEY
        template.setAppId(appId);
        template.setAppkey(appKey);
        // 设置通知栏标题与内容
        template.setTitle(title);
        template.setText(content);
        // 配置通知栏图标
        template.setLogo(icon);
        // 配置通知栏网络图标，填写图标URL地址
        template.setLogoUrl(logoUrl);
        // 设置通知是否响铃，震动，或全部可清除
        template.setIsRing(isRing);
        template.setIsVibrate(isVibrate);
        template.setIsClearable(isClearable);
        // 透传消息设置�?1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启�?
        template.setTransmissionType(Transmission);
        template.setTransmissionContent(TransmissionContent);
        return template;
    }
    
    /**
     * 传透推送模板
     * @param param 传入数据
     * @return
     */
    private static TransmissionTemplate TransmissionTemplateDemo(String param){
	    TransmissionTemplate template = new TransmissionTemplate();
	    template.setAppId(appId);
	    template.setAppkey(appKey);
	    // 透传消息设置�?1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启�?
	    template.setTransmissionType(2);
	    template.setTransmissionContent(param);
	    // 设置定时展示时间
	    // template.setDuration("2015-01-16 11:40:00", "2015-01-16 12:24:00");
	    return template;
    }
}
