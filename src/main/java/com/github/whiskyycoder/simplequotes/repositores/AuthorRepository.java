package com.github.whiskyycoder.simplequotes.repositores;

import com.github.whiskyycoder.simplequotes.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
