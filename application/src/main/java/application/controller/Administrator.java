package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import application.entities.dministratation;
import application.entities.user;

@Controller
public class Administrator {
	@Getmapping("/addproduct")
	public String showproduct(Model model) {
		model.addAttribute("administrator", new dministratation());
		return "addproduct";
	}	
	@postMapping("/addproduct")
	public String adduser(Model model  ,@ModelAttribute dministratation d) {
	//model.addAttribute("user", new user());
		return null;
	}
	

}
