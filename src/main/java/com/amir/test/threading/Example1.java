package com.amir.test.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) {

        int coreSize = 5;
        int maxSize = 10;
        ExecutorService executorService = new ThreadPoolExecutor(coreSize, maxSize, 3000, TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(10));

        for (int i = 0; i < maxSize + 9; i++) {
            executorService.execute(MyRunnable("test" + i));
        }

        executorService.shutdown();
    }

    private static Runnable MyRunnable(final String msg) {
        return () -> {
            System.out.println(Thread.currentThread().getName() + ", " + msg);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }

/*    public static class MyRunnable implements Runnable {
        String msg;

        public MyRunnable(String msg) {
            this.msg = msg;
        }

        @SneakyThrows
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", " + msg);
            Thread.sleep(1000);
        }
    }*/
}
