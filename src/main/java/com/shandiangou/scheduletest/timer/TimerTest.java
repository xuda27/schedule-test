package com.shandiangou.scheduletest.timer;

import java.util.Timer;
import java.util.TimerTask;

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
