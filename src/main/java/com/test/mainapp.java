package com.test;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


	
public class mainapp {
	private static final Log log = LogFactory.getLog(mainapp.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		t1 obj = (t1)ctx.getBean("t1");
		obj.getMessage();
		log.info("Exiting the program");
		log.debug("Going to create HelloWord Obj");
//		ctx.registerShutdownHook();
//		System.out.println(obj.getMap().get("1"));
		
	}

}
