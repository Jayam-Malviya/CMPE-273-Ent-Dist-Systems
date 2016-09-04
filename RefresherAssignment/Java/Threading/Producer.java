package com.darkRealm;

import java.util.ArrayList;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Producer implements Runnable {
    ArrayList<String> _contentWriteBuffer;
    private int _bufferLength;

    public Producer(ArrayList<String> buffer, int bufferLength) {
        _contentWriteBuffer = buffer;
        _bufferLength = bufferLength;
    }

    @Override
    public void run() {
        int lines = 0;
        while (true) {
            synchronized (_contentWriteBuffer) {
                if (lines == _bufferLength) {
                    break;
                }
                if (_contentWriteBuffer.size() < _bufferLength) {
                    System.out.println("Writing Content Line #" + lines);
                    _contentWriteBuffer.add("Line #" + lines);
                    lines++;
                }

            }

        }
    }
}