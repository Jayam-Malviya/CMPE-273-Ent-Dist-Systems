package com.darkRealm;

import sun.util.resources.cldr.naq.CalendarData_naq_NA;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Customer {
    private String _name;
    private long _accountNuber;

    public Customer(String name, long accountNuber){
        _name = name;
        _accountNuber = accountNuber;
    }

    @Override
    public String toString() {
        return "Account No: " + _accountNuber + " Name: " + _name;
    }

}
