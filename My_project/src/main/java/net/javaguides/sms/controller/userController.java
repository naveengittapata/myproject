package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.sms.entity.user;
import net.javaguides.sms.service.userService;



@Controller
public class userController {


	public userService userservice;
	

//	public userController(userService userservice) {
//		super();
//		this.userservice = userservice;
//	}

	@GetMapping("/user")
	public String listuser(Model model) {
		
		return "user";
	}
	
	@GetMapping ("/user/index")
	public String usertable(Model model) {
		user s =new user(null, null, null);
		
		model.addAttribute("user", userservice.getAllusers());
		return "user_table";
	}
	

	
	

}
