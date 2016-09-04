package com.darkRealm;

import java.util.ArrayList;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Consumer implements Runnable {


    private ArrayList<String> _contentReadBuffer;

    public Consumer(ArrayList<String> buffer) {
        _contentReadBuffer = buffer;
    }

    @Override
    public void run() {
        String read;
        while (true) {
            try {
                synchronized (_contentReadBuffer) {
                    if (_contentReadBuffer.size() == 0) {
                        Thread.sleep(500);
                    }
                    if (_contentReadBuffer.size() == 1) {
                        read = _contentReadBuffer.remove(0);
                        System.out.println("Reading Content Line #" + read);
                        break;
                    }

                    if (_contentReadBuffer.size() > 1) {
                        read = _contentReadBuffer.remove(0);
                        System.out.println("Reading Content Line #" + read);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}