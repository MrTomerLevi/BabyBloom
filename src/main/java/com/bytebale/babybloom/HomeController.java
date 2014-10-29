package com.bytebale.babybloom;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bytebale.babybloom.model.Event;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}*/
		  

	    /*@RequestMapping("/event")
	    public @ResponseBody Event greeting(
	            @RequestParam(value="name", required=false, defaultValue="Lavie") String name) {
	    	System.out.println("==== in event ====");
	        return new Event("Matern","Only from left side",new Date());
	    }*/
	    
	    @RequestMapping("/event")
	    public @ResponseBody Event event() {
	    	System.out.println("==== in event ====");
	        return new Event("Matern","Only from left side",new Date());
	    }
	
}
