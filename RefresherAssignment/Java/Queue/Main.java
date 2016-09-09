package com.darkRealm;

public class Main {

    public static void main(String [] args) {
        // write your code here
        Teller wellsFargoTeller = new Teller(1000);

        Customer smith = new Customer("Smith", 9988774);
        Customer alan = new Customer("Alan", 9988773);
        Customer ben = new Customer("ben", 9988772);

        CustomerRequest smithReq1 = new CustomerRequest(smith, 100);
        CustomerRequest alanReq1 = new CustomerRequest(alan, 80);
        CustomerRequest benReq1 = new CustomerRequest(ben, 150);
        CustomerRequest smithReq2 = new CustomerRequest(smith, 300);
        wellsFargoTeller.doRequest(smithReq1);
        wellsFargoTeller.doRequest(alanReq1);

        wellsFargoTeller.process();

        wellsFargoTeller.doRequest(benReq1);
        wellsFargoTeller.doRequest(smithReq2);

        wellsFargoTeller.process();
    }


}
