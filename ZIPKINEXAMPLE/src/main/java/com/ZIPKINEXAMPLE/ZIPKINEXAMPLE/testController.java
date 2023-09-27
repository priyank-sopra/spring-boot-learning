package com.ZIPKINEXAMPLE.ZIPKINEXAMPLE;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@RequestMapping("/home")
	public String h()
	{
		return "hi suresh Bye";
	}
	@RequestMapping("/about")
	public String h1()
	{
		return "hi  about Bye";
	}
	@PostMapping("/by")
	public String h11()
	{
		return " I am post hi  about Bye";
	}
}
