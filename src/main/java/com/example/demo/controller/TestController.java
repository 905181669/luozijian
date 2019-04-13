package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {


	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("进来");
		System.out.println("进来3");
		System.out.println("2019-4-13 23:25修改提交");
        add();
        return "Hello World";
    }

	private void add(){
	    System.out.println(1);
    }
	
}
