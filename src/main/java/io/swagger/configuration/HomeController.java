package io.swagger.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String index() {
		log.info("swagger-ui.html");
		return "redirect:swagger-ui/";
	}
	
	@RequestMapping(value = "/swagger-ui.html")
	public String redirectIndex() {
		log.info("swagger-ui.html");
		return "redirect:swagger-ui/";
	}
}
