package com.chhagan.thread.day1;

/**
 * Created by chhagan on 10/1/2017.
 */
public class Common  {
    static volatile int value;
    static volatile boolean flag = true;
    public synchronized void producer(int i ){
        if(flag == true){
            value = i;
            System.out.println("Producer has produced number : "+i);
            flag = false;
            notify();
            } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized int consumer(){
        if(flag == true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            flag = true;
            notify();
        }
        return value;
    }
}
