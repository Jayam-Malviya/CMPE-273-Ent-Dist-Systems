package com.darkRealm;

import java.util.Date;
import java.util.Vector;

/**
 * Created by Jayam on 9/9/2016.
 */
public class Producer extends Thread {

    static final int maxMsgs = 5;
    int readTimes ;
    int writeTimes ;
    private Vector<String> messages = new Vector<>();

    Producer() {
        readTimes = writeTimes = 0;
    }

    @Override
    public void run() {
        System.out.println("Producer Running");
        while (!isComplete()) {
            try {
                writeMessage();
            } catch (InterruptedException e) {
            }
        }
    }

    private synchronized void writeMessage() throws InterruptedException {
        while (messages.size() == maxMsgs) {
            wait();
        }
        System.out.println("Produce writing message...");
        messages.add(new Date().toString());
        writeTimes++;
        notify();
    }

    public synchronized String getMessage() throws InterruptedException {
        notify();
        while (messages.size() == 0) {
            wait();
        }
        String readMessage = messages.firstElement();
        messages.removeElement(readMessage);
        readTimes++;
        return readMessage;
    }

    public boolean isComplete() {
        return writeTimes == 10 && readTimes == 10;
    }
}
