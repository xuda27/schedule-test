package com.shandiangou.scheduletest.scheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        ScheduledExecutorService single = Executors.newSingleThreadScheduledExecutor();
        // 延迟时间/ 时间间隔
        single.scheduleAtFixedRate(()-> System.out.println("Hello, ScheduledExecutor!"), 1, 1, TimeUnit.SECONDS);
    }
}
