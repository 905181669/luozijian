package com.example.demo.controller;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BaseDao;
import com.example.demo.domain.BaseCode;
import com.example.demo.domain.BaseEntity;
import com.example.demo.service.BaseService;

@RestController
public class HelloWorldController {

	@Autowired
	private BaseService baseService;
	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("进来");
		BaseCode b = (BaseCode) baseService.findById(10L);
		
        return "Hello World";
    }

	
	
}
