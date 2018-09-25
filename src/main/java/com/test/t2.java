package com.test;

import org.springframework.beans.factory.annotation.Required;

public class t2 implements t{
	private String tt;
	public void test() {
		System.out.println(tt);
	}
	@Required
	 public void setTt(String tt) {
		this.tt = tt;
	}
	 public String getTt() {
		return tt;
	}
}
