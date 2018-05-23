package com.github.whiskyycoder.simplequotes.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Author author;

    private String content;

    private Date date;

    public Quote(Author author, String content) {
        this.author = author;
        this.content = content;
        this.date=new Date();
    }

    public Quote() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quote quote = (Quote) o;

        if (getId() != null ? !getId().equals(quote.getId()) : quote.getId() != null) return false;
        if (getContent() != null ? !getContent().equals(quote.getContent()) : quote.getContent() != null) return false;
        return getDate() != null ? getDate().equals(quote.getDate()) : quote.getDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public Quote setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Quote setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Quote setDate(Date date) {
        this.date = date;
        return this;
    }
}
