package com.zhuchuanxiao.makefine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhuchuanxiao.makefine.entity.Designer;

@RestController
public class TestController {
	
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	
	@RequestMapping("/addDesigner")
    String addUser() {
		Designer designer = new Designer();
		designer.setCreateTime(System.currentTimeMillis());
		designer.setCompany("东软集团");
		designer.setDescribe("描述描述");
		designer.setName("猪猪");
        return "Hello World!";
    }
}
