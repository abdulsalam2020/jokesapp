package com.sfg.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
	
	ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
