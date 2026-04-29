package org.example.model.book;

import lombok.Getter;
import lombok.Setter;
import org.jooq.impl.QOM;

import java.util.List;

@Getter
@Setter
public class Mybook {
    String bookTitle;
    Long bookPrice;
    List<Countries> publishedCountries;

    public Mybook(String book1, long l, List<Countries> usa) {
        this.bookTitle = book1;
        this.bookPrice = l;
        this.publishedCountries = usa;
    }
}
