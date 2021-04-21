package org.daming.person.utils;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class SnowflakeIdWorkerTest {

    @Test
    public void nextId() throws InterruptedException {
        var set = Collections.synchronizedSet(new HashSet<>(10000));
        var snowflakeIdWorker = new SnowflakeIdWorker(0, 0);
        Runnable runnable = () -> {
            var num = snowflakeIdWorker.nextId();
            set.add(num);
        };
        Thread[] threads = new Thread[10000];
        for (int i=0; i<10000; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i=0; i<10000; i++) {
            threads[i].start();
        }
        for (int i=0; i<10000; i++) {
            threads[i].join();
        }

        assertEquals(10000, set.size());
    }
}