package org.example.model;

public class Stock {

    private String stockId;
    private String name;
    private Integer quantity;


    public Stock(String stockId, String name, Integer quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTicker() {
        return name;
    }
}
