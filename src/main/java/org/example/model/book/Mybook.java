package org.example.model.book;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Mybook {
    String bookTitle;
    Long bookPrice;
    List<Countries> publishedCountries;
}
