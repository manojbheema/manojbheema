package com.ameya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class GreetingController {
	
	@RequestMapping(value="/morningMsg",method=RequestMethod.GET)
	public String printMorningGreeting(ModelMap model){
		model.addAttribute("welcomeMsg", "Hello All... <I>GOOD MORNING</I>");
		return "morning-message";
	}
	@RequestMapping(value="/eveningMsg",method=RequestMethod.GET)
	public String printEveningGreeting(ModelMap model){
		model.addAttribute("welcomeMsg", "Hello All... <I>GOOD EVENING</I>");
		return "evening-message";
	}
}






/*
 *  
 *  1. Inject the attribute in controller
 *  	@Autowired 
 *		private HttpSession httpSession;
 *	
 *	2. Pass it to Controller method
 *		public String addToCart(long productId, HttpSession httpSession) {
 *   		//do something with the httpSession 
 * 		}
 * 
 * 	3. Using @SessionAttributes
 * 		@SessionAttributes("shoppingCart")
 *		public class Controller {
 *			ModelAndView modelAndView = new ModelAndView();
 *			//claculate and manage the shoppingCart
 *       	modelAndView.addObject("shoppingCart", shoppingCart);
 *		}
 *
 * 
 * */





