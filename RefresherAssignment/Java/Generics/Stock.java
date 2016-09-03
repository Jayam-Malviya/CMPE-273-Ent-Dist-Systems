package com.darkRealm;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Stock implements Comparable {

    private String _name;
    private double _price;


    public Stock(String name, double price) {
        _name = name;
        _price = price;
    }

    @Override
    public int compareTo(Object o) {
        Stock stock = (Stock) o;
        if (this._price == stock._price) {
            return 0;
        } else if (this._price < stock._price) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Stock Name: " + _name + "   Price : " + _price;
    }
}
