package com.sfg.jokesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class JokesConfig {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
