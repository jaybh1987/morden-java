package org.example.model;

import org.example.interfaces.StockService;

import java.util.List;

public class Portfolio {

    private StockService stockService;

    private List<Stock> stocks;

    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public double getMarketValue() {
        double marketValue = 0.0;
        for (Stock s: stocks) {
            marketValue += stockService.getPrice(s) * s.getQuantity();
        }
        return marketValue;
    }
}
