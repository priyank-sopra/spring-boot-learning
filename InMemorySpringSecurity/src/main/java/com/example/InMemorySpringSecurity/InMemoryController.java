package com.example.InMemorySpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InMemoryController {

	//Can we access  by Mukesh
		@PostMapping("/admin")
		public String saveAdmin() {
			return "admin saved";
		}

		//Can we access  by Mukesh
		@GetMapping("/admin")
		public String getAdmin() {
			return "admin is sent back";
		}

		//Can we access  by Mukesh
		@PostMapping("/user")
		public String saveUser() {
			return "user saved";
		}

		//Can we access  by Mukesh
		//Can we access  by Ramesh
		@GetMapping("/user")
		public String getUser() {
			return "user is sent back";
		}

	 
}
