package org.example.model.book;

public enum Countries {

    USA("usa"),
    CANADA("canada"),
    INDIA("india"),;

    private String country;

     Countries(String country){
        this.country = country;
    }
}
