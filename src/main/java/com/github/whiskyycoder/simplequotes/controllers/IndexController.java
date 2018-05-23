package com.github.whiskyycoder.simplequotes.controllers;

import com.github.whiskyycoder.simplequotes.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    private QuotesService quotesService;

    public IndexController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }


    @RequestMapping("/")
    public String getIndexPage(Model model){

        model.addAttribute("quote",quotesService.getRandomQuote());

        return"index";
    }


}
