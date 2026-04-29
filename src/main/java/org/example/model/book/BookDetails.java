package org.example.model.book;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookDetails {

    List<Mybook> mybooks;

     public List<Mybook> getMybooks() {
        return mybooks;
    }

}
