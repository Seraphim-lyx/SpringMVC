package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
// @RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "test/hello";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {
		System.out.println("redirect");
		return "redirect:final";
	}

	@RequestMapping(value = "/final", method = RequestMethod.GET)
	public String finalPage() {
		System.out.println("final");
		return "test/final";
	}
}