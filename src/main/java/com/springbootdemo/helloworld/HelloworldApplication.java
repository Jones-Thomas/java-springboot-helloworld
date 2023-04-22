package com.springbootdemo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}

@RestController
@RequestMapping(path = "/")
class DemoController{
	@GetMapping("print/{msg}")
	public String print(@PathVariable(value = "") String msg){
		return "Hello Welcome to our Java SpringBoot Application - "+msg;
	}

}