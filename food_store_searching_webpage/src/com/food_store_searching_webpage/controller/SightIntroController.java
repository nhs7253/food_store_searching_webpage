package com.food_store_searching_webpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.food_store_searching_webpage.service.SightIntroService;

@Controller
/**
 * 사이트 소개글 Controller
 * @author hs
 * 사이트 소개글 Controller
 */
public class SightIntroController {
	
	@Autowired
	SightIntroService sightIntroService;
	
	@RequestMapping("/viewSightIntroController")
	public ModelAndView viewSightIntroController(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("viewSightIntro", sightIntroService.viewSightIntro());
		modelAndView.setViewName("");

		return modelAndView;
	}
}
