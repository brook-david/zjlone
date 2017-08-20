package com.ort.frame.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.plugin.ehcache.CacheKit;
import com.ort.frame.util.CacheUtil;

/**
 * 缓存定时器
 * @author zjl
 *
 */
public class EhCacheTimer {
	
	private static Thread timer;
	private static Logger log = LoggerFactory. getLogger(EhCacheTimer.class);	
	/**
	 * 初始化
	 * @param time 间隔时间
	 */
	public static void init(final int time){
		timer = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					CacheUtil.getMemberCache().evictExpiredElements();
					log.debug("clear");
				}
			}
		});
		
		timer.start();
		log.debug("the EhCacheTimer is start.");
	}
	
}
