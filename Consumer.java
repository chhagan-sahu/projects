package com.chhagan.thread.day1;

/**
 * Created by chhagan on 10/1/2017.
 */
public class Consumer extends Thread{
    Common c;
    public Consumer(Common c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true){
            int i = c.consumer();
            System.out.println("Consumer consumed : "+i);
            //notify();
            try {
                Thread.sleep(1822);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
