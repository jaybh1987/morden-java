package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.example.enumsdemo.Permissions;
import org.example.model.book.BookDetails;
import org.example.model.book.Countries;
import org.example.model.book.Mybook;
import org.jooq.impl.QOM;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.model.book.Countries.USA;


public class Main {


    public static void main(String[] args) {

        List<Mybook> list = List.of(
                new Mybook("Book1", 100L, List.of(Countries.USA, Countries.CANADA)),
                new Mybook("Book2", 150L, List.of(Countries.INDIA)),
                new Mybook("Book3", 200L, List.of(Countries.INDIA))
        );

        //get the sum of all books.
        Long sum = list.stream().mapToLong(Mybook::getBookPrice).sum();
        System.out.println("Sum of all books: " + sum);

        //Group by countries and count the number of books published in each country.
        Map<Countries, Long> groupByCountry = list.stream()
                .flatMap(book -> book.getPublishedCountries().stream())
                .collect(Collectors.groupingBy(country -> country, Collectors.counting()));
        System.out.println("Books published in each country: " + groupByCountry);

    }

}


























