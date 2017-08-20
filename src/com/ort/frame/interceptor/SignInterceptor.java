package com.ort.frame.interceptor;



import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.ort.entity.frame.Result;
import com.ort.frame.util.ExcepUtil;
import com.ort.frame.util.MD5Util;
import com.ort.frame.util.RegexUtil;
import com.ort.frame.util.StringUtil;
import com.ort.frame.util.exception.MyException;

/**
 * 签名拦截器
 * 进行相关的验签操作
 */
public class SignInterceptor implements Interceptor {
	
	private static Logger log = LoggerFactory. getLogger(SignInterceptor.class);	
	private String accessKey = "witspal";	//签名头
	
	private boolean schema = true;	//开发者模式
	
	public void intercept(Invocation inv) {
		
		try{
			if(!schema){
				log.debug("sign check.........");
				Controller controller = inv.getController();
				Enumeration<String> names = controller.getParaNames();
				String genSign;
				String sign = controller.getPara("sign");
				String timestamp = controller.getPara("timestamp");
				if(StringUtil.isEmpty(sign)){
					ExcepUtil.EX300("sign");
				}
				if(StringUtil.isEmpty(timestamp)){
					ExcepUtil.EX300("timestamp");
				}
				if(!RegexUtil.checkDigit(timestamp)){
					ExcepUtil.EX301("timestamp");
				}
				
				StringBuilder sb = new StringBuilder();
				//签名头拼接
				Integer timestampNum = Integer.valueOf(timestamp);
				if(timestampNum%2 == 0){
					sb.append(accessKey);
					sb.append("&");
				}
				
				//签名参数拼接
				while(names.hasMoreElements()){
					String paraName = names.nextElement();
					if(!"sign".equals(paraName)){
						sb.append(paraName);
						sb.append("=");
						sb.append(controller.getPara(paraName));
						sb.append("&");
					}
				}
				sb.replace(sb.length()-1, sb.length(), "");	//去掉最后的&
				log.debug(sb.toString());
				genSign = MD5Util.md5Encode(sb.toString());	//生成签名
				
				log.debug(sign+"::"+genSign);
				if(!sign.equals(genSign)){	//签名错误
					ExcepUtil.EX304();
				}
				
				log.debug("sign check is ok");
			}
			inv.invoke();
		}catch (MyException e) {	//已知异常捕捉
			Result error = new Result();
			error.setCode(ExcepUtil.getErrorCode(e.getMessage()));
			error.setMsg(e.getMessage());
			
			log.error(e.getMessage());
			
			inv.getController().renderJson(error);
		}catch (Exception e) {	//未知异常捕捉
			Result error = new Result();
			error.setCode("500");
			error.setMsg("The service is error");
			
			e.printStackTrace();
			
			inv.getController().renderJson(error);
		}
	}
}
