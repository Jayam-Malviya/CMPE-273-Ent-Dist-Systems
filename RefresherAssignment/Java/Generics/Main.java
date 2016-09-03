package com.darkRealm;

public class Main {

    public static void main(String[] args) {
        doStock();
    }

    private static void doStock() {
        Stock[] stocks = new Stock[]{
                new Stock("Apple", 107.3),
                new Stock("Google", 796.87),
                new Stock("Facebook", 126.51),
                new Stock("Microsoft", 57.67),
                new Stock("SalesForce", 75.10),
        };
        Pair lowestHighestStock = Utility.findMinMax(stocks);
        System.out.println("Lowest Stock : " + lowestHighestStock.getFirst());
        System.out.println("Highest Stock : " + lowestHighestStock.getSecond());
    }
}