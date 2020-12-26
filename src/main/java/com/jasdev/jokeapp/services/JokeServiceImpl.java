package com.jasdev.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes1;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes1 = chuckNorrisQuotes;
    }

    @Override
    public  String getJoke() {
        return chuckNorrisQuotes1.getRandomQuote();
    }
}
