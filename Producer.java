package com.chhagan.thread.day1;

/**
 * Created by chhagan on 10/1/2017.
 */
public class Producer extends Thread {
    Common c;
    public Producer(Common c){
        this.c = c;
    }
    @Override
    public void run() {
        int i =0;
        while (true){
            c.producer(i);
            i=i+1;
            try {
                Thread.sleep(1822);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
