package com.github.whiskyycoder.simplequotes.services;

import com.github.whiskyycoder.simplequotes.model.Quote;
import com.github.whiskyycoder.simplequotes.repositores.AuthorRepository;
import com.github.whiskyycoder.simplequotes.repositores.QuoteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.StreamSupport;

@Service
public class QuotesService {

    private AuthorRepository authorRepository;
    private QuoteRepository quoteRepository;

    public QuotesService(AuthorRepository authorRepository, QuoteRepository quoteRepository) {
        this.authorRepository = authorRepository;
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote(){
        Quote quote=null;
        Random random =new Random();
        long totalCount=quoteRepository.count();
        List<Quote> target = new ArrayList<>();
        quoteRepository.findAll().forEach(target::add);
        if(totalCount==0)
            return null;
        return target.get(random.nextInt((int)totalCount ));
    }

    public void addQuote(Quote quote){
        quoteRepository.save(quote);
    }

}
