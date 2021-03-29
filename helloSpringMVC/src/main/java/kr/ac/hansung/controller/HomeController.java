package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	private static final Logger LOGGER = LoggerFactory.getLogger("kr.ac.hansung.controller.HomeController");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		
		String url = request.getRequestURL().toString();
		String clientIPaddr = request.getRemoteAddr();
		
		LOGGER.info("Request URL: {}, Client IP: {}", url, clientIPaddr);
		
		return "home";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newHome() {
		return "index";
	}
	
}
