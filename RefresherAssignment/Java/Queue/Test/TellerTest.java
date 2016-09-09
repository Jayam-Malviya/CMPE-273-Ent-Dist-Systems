package com.darkRealm.Test;

import com.darkRealm.Teller;
import com.darkRealm.Customer;
import com.darkRealm.CustomerRequest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/3/2016.
 */
public class TellerTest {

    @Test
    public void tellerShallNotProcessAnyRequestIfRequestQueIsEmpty() {
        Teller teller = new Teller(1000);
        teller.process();
        assertEquals(0, teller.getTotalRequestsProcessed());
    }

    @Test
    public void tellerShallProcessOnlyQueuedRequest() {
        Teller teller = new Teller(1000);

        Customer smithTest = new Customer("Smith", 9988774);
        Customer alanTest = new Customer("Alan", 9988773);

        CustomerRequest smithReq1 = new CustomerRequest(smithTest, 100);
        CustomerRequest alanReq1 = new CustomerRequest(alanTest, 80);
        CustomerRequest smithReq2 = new CustomerRequest(smithTest, 300);
        teller.doRequest(smithReq1);
        teller.doRequest(alanReq1);

        teller.process();

        teller.doRequest(smithReq2);

        assertEquals(2, teller.getTotalRequestsProcessed());
    }
}