package com.fkweixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

	@RequestMapping("/index.do")
	public String toIndex(Model model) {
		model.addAttribute("test", "你好ass");
		System.out.println("你好@@@!");
		return "index";
	}
	
	public void test(){
		
	}
}
