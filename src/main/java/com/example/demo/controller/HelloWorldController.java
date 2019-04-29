package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author luozijian
 */
@RestController
public class HelloWorldController {


	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("2019-4-27 20:34修改提交");
		System.out.println("2019-4-29 21:25 luozijain_dev分支修改提交");
        add();
        return "Hello World";
    }

	private void add(){
	    System.out.println(1);
    }



}
