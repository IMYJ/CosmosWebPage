package com.cosmos.lab;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller//HomeController클래스를 컨트롤러로 설정하는 명령
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
	@RequestMapping({ "/" })
	public String blog(Model model) {
		return "home";
	}
	
	@RequestMapping({ "/introduction" })
	public String introduction(Model model) {
		return "introduction";
	}
	
	@RequestMapping({ "/members" })
	public String members(Model model) {
		return "members";
	}
	
	@RequestMapping({ "/photos" })
	public String photos(Model model) {
		return "photos";
	}
	
	@RequestMapping({ "/board/register" })
	public String board(Model model) {
		return "board/register";
	}
	

}
