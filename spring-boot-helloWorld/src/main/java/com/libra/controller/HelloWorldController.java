package com.libra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public Object index() {
    	BodyParam bodyParam = new BodyParam();
    	bodyParam.setBody("Hello World");
        return "Hello World";
    }
    
    @RequestMapping("/helloBody")
    public Object helloBody() {
    	BodyParam bodyParam = new BodyParam();
    	bodyParam.setBody("Hello Body");
        return bodyParam;
    }
}