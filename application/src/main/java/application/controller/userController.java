package application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import application.entities.user;


@Controller
public class userController {
	 @GetMapping("/adduser")
	public String showuser(Model model) {
		model.addAttribute("user", new user());
		return "adduser";
	}
	@postMapping("/adduser")
		public String adduser(Model model  ,@ModelAttribute user s) {
		//model.addAttribute("user", new user());
			return null;
		}
	@GetMapping("/login")
	public String showlogin (Model model) {
		model.addAttribute("user", new user());
		return "login";
	}
	@postMapping("/login")
	public String login(Model model  ,@ModelAttribute user s) {
	//model.addAttribute("user", new user());
		return null;
	}
	
	

}
