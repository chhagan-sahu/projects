package com.chhagan.thread.day1;

/**
 * Created by chhagan on 10/12/2017.
 */
public class Test implements Runnable {
    @Override
    public void run() throws NumberFormatException{
        System.out.println("chhagan");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Thread tt = new Thread(t);
        tt.start();
    }
}
