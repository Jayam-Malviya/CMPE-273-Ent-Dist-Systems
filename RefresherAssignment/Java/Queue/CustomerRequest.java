package com.darkRealm;

/**
 * Created by Jayam on 9/3/2016.
 */
public class CustomerRequest {
    Customer _customer;
    long _withdrawlAmount;

    public CustomerRequest(Customer cust, long amount) {
        _customer = cust;
        _withdrawlAmount = amount;
    }

    @Override
    public String toString() {
        return _customer.toString() + " Withdrawl Amount : " + _withdrawlAmount;
    }
}
