package com.example.springGuiApp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeContoller {

	@RequestMapping("/about")
	public String hi() {
		System.out.println("hi hello");
		return "hi";
	}

	@RequestMapping("/data1")
	public String data1(Model ob1) {

		System.out.println("THIS IS ABOUT URL");
		// MODEL IS USED FOR SENDING DATA FROM CONTROLLER TO VIEW
		// SYNTAXIS ADDATTRIBUTUE("KEY",VALUE)
		ob1.addAttribute("name", "MOHAN");
		ob1.addAttribute("mobile", 999);
		ob1.addAttribute("address", "BANGLORE");

		return "data";
	}

	@RequestMapping("/contact")
	public String showform() {
		System.out.println("i am contact");
		return "contact";
	}

	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String Handleform(@RequestParam("a") String x, @RequestParam("b") String y, @RequestParam("c") String z,
			Model object1) {

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("i am contact");
		object1.addAttribute("username", x);
		object1.addAttribute("email", y);
		object1.addAttribute("mobile", z);

		return "success";

	}

}
