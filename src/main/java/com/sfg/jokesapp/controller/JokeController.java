package com.sfg.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.jokesapp.service.JokeService;

@Controller
public class JokeController {
	JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke",jokeService.getJoke());
		return "chucknorris";
	}
}
