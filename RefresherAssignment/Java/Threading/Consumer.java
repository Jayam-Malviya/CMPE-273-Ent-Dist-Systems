package com.darkRealm;

/**
 * Created by Jayam on 9/9/2016.
 */
public class Consumer extends Thread{
    Producer prod;
    Consumer (Producer p) {
        prod = p;
    }

    @Override
    public void run(){
        System.out.println("Consumer Running");

        while(!prod.isComplete()){
            try {
                String msg = prod.getMessage();
                System.out.println("Read Message : "+msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
