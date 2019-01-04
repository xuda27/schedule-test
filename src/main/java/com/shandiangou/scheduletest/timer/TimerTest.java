package com.shandiangou.scheduletest.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 1. 线程安全
 * 2. 依赖TimerTask（非实现Runable接口）
 * 3. 每个Timer对象相对应的是单个后台线程 / 单线程 / 阻塞
 * 4. 没有时间单位 不支持coin表达式
 */
public class TimerTest {
    public static void main(String[] args) {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello, TimerTask!");
            }
        }, 1000L, 1000L);
    }
}
