package com.ort.frame.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;

public class MemberCacheListener  implements CacheEventListener {  
		
	private static Logger log = LoggerFactory.getLogger(MemberCacheListener.class);
	@Override  
	public void notifyElementRemoved(Ehcache cache, Element element)  
		throws CacheException {  
		log.debug("removed");  
	}  
   
	@Override  
	public void notifyElementPut(Ehcache cache, Element element)  
			throws CacheException {  
		//TODO 用户登录日志表记录
		log.debug("member login");
	}  
   
	@Override  
	public void notifyElementUpdated(Ehcache cache, Element element)  
			throws CacheException {  
		System.out.println("updated");  
	}  
   
	@Override  
	public void notifyElementExpired(Ehcache cache, Element element) {  //获取时过期时调用
		//TODO 用户登出日志表记录
		log.debug("member logout");
	}  
   
	@Override  
	public void notifyElementEvicted(Ehcache cache, Element element) {  
		log.debug("evicted");  
	}  
   
	@Override  
	public void notifyRemoveAll(Ehcache cache) {  
		log.debug("removeAll");  
	}  
   
	@Override  
	public void dispose() {  
   
	}  
    
	public Object clone() throws CloneNotSupportedException {  
		throw new CloneNotSupportedException();  
	}  
	   
}  
