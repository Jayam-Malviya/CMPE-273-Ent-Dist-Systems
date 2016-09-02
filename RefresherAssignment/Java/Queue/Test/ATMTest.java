package com.darkRealm.Test;

import com.darkRealm.ATM;
import com.darkRealm.Customer;
import com.darkRealm.CustomerRequest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/3/2016.
 */
public class ATMTest {

    @Test
    public void atmShallNotProcessAnyRequestIfRequestQueIsEmpty() {
        ATM atm = new ATM(1000);
        atm.process();
        assertEquals(0, atm.getTotalRequestsProcessed());
    }

    @Test
    public void atmShallProcessOnlyQueuedRequest() {
        ATM atm = new ATM(1000);

        Customer smithTest = new Customer("Smith", 9988774);
        Customer alanTest = new Customer("Alan", 9988773);

        CustomerRequest smithReq1 = new CustomerRequest(smithTest, 100);
        CustomerRequest alanReq1 = new CustomerRequest(alanTest, 80);
        CustomerRequest smithReq2 = new CustomerRequest(smithTest, 300);
        atm.doRequest(smithReq1);
        atm.doRequest(alanReq1);

        atm.process();

        atm.doRequest(smithReq2);

        assertEquals(2, atm.getTotalRequestsProcessed());
    }


}