package com.revomatico.internship2019.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping("/helloworld")
public String HelloWorld() {
	return "Hello World";
}
}
