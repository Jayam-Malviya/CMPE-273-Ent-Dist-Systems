package com.darkRealm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Jayam on 9/3/2016.
 */
public class ATM {
    private long _availableCash;
    private long _requestsProcessed = 0;
    private Queue _requestsQue;

    public ATM(long amt) {
        _availableCash = amt;
        _requestsQue = new LinkedList<CustomerRequest>();
    }

    public void doRequest(CustomerRequest cr) {
        _requestsQue.add(cr);
    }

    public void process() {
        while (!_requestsQue.isEmpty()) {
            CustomerRequest cr = (CustomerRequest) _requestsQue.remove();
            System.out.println("Serving Request " + cr);
            _requestsProcessed++;
        }
    }

    public long getTotalRequestsProcessed() {
        return _requestsProcessed;
    }
}
