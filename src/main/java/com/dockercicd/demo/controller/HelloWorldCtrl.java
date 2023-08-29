package com.dockercicd.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/helloworld/")
public class HelloWorldCtrl {

	@RequestMapping(value="/wish/{name}", produces="application/json")
	public String getWishesByName(@PathVariable String name)
	{
		return "Hello, "+name+"! Have a Great Day!";
	}
}
