package com.github.whiskyycoder.simplequotes.controllers;


import com.github.whiskyycoder.simplequotes.model.Quote;
import com.github.whiskyycoder.simplequotes.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quote")
public class QuoteController {


    private QuotesService quotesService;

    public QuoteController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/add/{content}")
    public String addQuote(@PathVariable(name = "content") String content) {

        Quote quote = new Quote(null, content);
        quotesService.addQuote(quote);

        return "index";
    }

}
