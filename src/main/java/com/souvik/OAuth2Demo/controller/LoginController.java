package com.souvik.OAuth2Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

   @RequestMapping("/")
    public String login() {
	return "index.jsp";
	
}
   @RequestMapping("/welcome")
   public ModelAndView showLoginPage() {
   	ModelAndView mv=new ModelAndView("welcome.jsp");
   	mv.addObject("name", "souvik");
   	return mv;
   	
   }

    

}