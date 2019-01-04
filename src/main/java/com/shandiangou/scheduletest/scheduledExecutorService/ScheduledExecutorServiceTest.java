package com.shandiangou.scheduletest.scheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 1. Runnable / Callable
 * 2. 有时间单位
 * 3. 只支持相对时间和周期作为参数
 * 4. 不支持coin表达式
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        ScheduledExecutorService single = Executors.newSingleThreadScheduledExecutor();
        // 延迟时间/ 时间间隔
        single.scheduleAtFixedRate(()-> System.out.println("Hello, ScheduledExecutor!"), 0, 1, TimeUnit.SECONDS);
    }
}
