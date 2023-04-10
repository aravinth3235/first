package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DemoController {
@GetMapping("/welcome/{name}")
public String meth1(@PathVariable String name ) 
{
	return "<h1> hai"+name+"Welcome to SpringBoot<h1>";
}
}
