package com.github.whiskyycoder.simplequotes.repositores;

import com.github.whiskyycoder.simplequotes.model.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote,Long> {
}
