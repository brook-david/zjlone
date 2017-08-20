package com.ort.frame.routes;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jfinal.config.Routes;
import com.jfinal.core.Controller;
import com.ort.frame.util.ClassUtil;
public class AutoRoutes extends Routes {	
	
	public  static Logger log = LoggerFactory. getLogger(AutoRoutes.class);	
	private String packageName;	
	
	public AutoRoutes(String packageName) {		
		this.packageName = packageName;
	}	
	
	@SuppressWarnings("unchecked")	
	public List<Class<? extends Controller>> getControllerClass() throws ClassNotFoundException {
		List<Class<?>> allClass = ClassUtil.getClasses(packageName);
		List<Class<? extends Controller>> controllerClasses = new ArrayList<Class<? extends Controller>>();		
		
		for (Class<?> controllerClass : allClass) {
			controllerClasses.add((Class<? extends Controller>) controllerClass);
		}		return controllerClasses;
	}	
	
	
	@Override
	public void config() {		
		try {
			List<Class<? extends Controller>> controllerClassList = getControllerClass();			
			for (Class<? extends Controller> controllerClass : controllerClassList) {
				add("/" + controllerClass.getSimpleName().replace("Controller", "").toLowerCase(), controllerClass);
			}
		} catch (ClassNotFoundException e) {
		    log.error("auto route exception ",e);
		}
	}
}