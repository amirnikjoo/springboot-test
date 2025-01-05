package com.amir.test.threading;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class Example3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        int coreSize = 5;
//        int maxSize = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(MyCallable("test1"));
        callables.add(MyCallable("test2"));
        callables.add(MyCallable("test3"));

        String test1 = executorService.invokeAny(callables);
        log.info("{}", test1);
        executorService.shutdown();
    }

    private static Callable<String> MyCallable(final String msg) {
        return () -> {
            log.info("{}, {}", Thread.currentThread().getName(), msg);
            return msg;
        };
    }
}
