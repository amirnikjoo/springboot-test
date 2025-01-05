package com.amir.test.threading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Example2 {
    public static void main(String[] args) {

//        int coreSize = 5;
//        int maxSize = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future test1 = executorService.submit(MyCallable("test1"));
        log.info("{}", test1.isDone());

        try {
            Object o = test1.get();
            log.info("got: {}", o.toString());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        log.info("{}", test1.isDone());
        log.info("{}", test1.isCancelled());

        executorService.shutdown();
    }

    private static Callable<String> MyCallable(final String msg) {
        return () -> {
            log.info("{}, {}", Thread.currentThread().getName(), msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return msg;
        };
    }
}
