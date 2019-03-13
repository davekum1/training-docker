package com.test.demodocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoDockerController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Docker";
	}
}
