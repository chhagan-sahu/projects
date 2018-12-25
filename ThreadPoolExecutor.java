package com.chhagan.thread.day1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chhagan on 9/30/2017.
 */
public class ThreadPoolExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i =1 ; i<=10 ; i++){
            service.submit(new Task(i));
        }
    }
}

final class Task implements Runnable{
    int id;
    public Task(int id) {
        this.id =id;
    }

    @Override
    public void run() {
        System.out.println(" task id "+id+ "ndone by" +Thread.currentThread().getName());
    }
}