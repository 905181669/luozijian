package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {


	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("进来");
		System.out.println("进来2");
        add();
        return "Hello World";
    }

	private void add(){
	    System.out.println(1);
    }
	
}
