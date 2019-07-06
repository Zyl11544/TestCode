package com.code.weather;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class WeatherController {
	final Logger log = Logger.getLogger(WeatherController.class);
	
	@RequestMapping(value="/weahterlist",method=RequestMethod.GET)
	public ModelAndView getWeatherList(ModelAndView andView){
		log.info("start ");
		andView.setViewName("index");
		return andView;
		
	}
	
}
