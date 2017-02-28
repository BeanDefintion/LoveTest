package com.ndc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {

	@RequestMapping("/login")
	public String aaa(){
		return "success";
	}
}
