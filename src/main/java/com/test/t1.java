package com.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class t1 {
	private String message;
	
	@Autowired
	@Qualifier("tt2")
	private t t2;
	
	private Map<String, t> map;

//	@Autowired
//	public void setT2(t t2) {
//		this.t2 = t2;
//	}

	public void setMap(Map<String, t> map) {
		this.map = map;
	}

	public Map<String, t> getMap() {
		System.out.println(map);
		return map;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// public void init() {
	// System.out.println("init");
	// }

	public void getMessage() {
		System.out.println("Your Message : " + message);
		t2.test();
	}

	// public void destroy() {
	// System.out.println("destroy");
	// }
}
