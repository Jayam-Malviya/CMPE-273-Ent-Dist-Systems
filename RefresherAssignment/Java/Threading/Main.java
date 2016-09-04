package com.darkRealm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> contentBuffer = new ArrayList<>();
        Producer producer = new Producer(contentBuffer, 5);
        Consumer consumer = new Consumer(contentBuffer);
        producer.run();
        consumer.run();
    }
}
