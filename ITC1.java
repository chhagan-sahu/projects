package com.chhagan.thread.day1;

/**
 * Created by chhagan on 10/1/2017.
 */
public class ITC1 {
    public static void main(String[] args) {
        Common c = new Common();
        Producer prod = new Producer(c);
        Consumer con = new Consumer(c);

        prod.start();
        con.start();
    }
}
