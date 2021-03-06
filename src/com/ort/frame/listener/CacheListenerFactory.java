package com.ort.frame.listener;

import java.util.Properties;

import com.ort.frame.timer.EhCacheTimer;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

public class CacheListenerFactory extends CacheEventListenerFactory {
	@Override  
	public CacheEventListener createCacheEventListener(Properties properties) {  
	   return new MemberCacheListener();  
	}  
}  
