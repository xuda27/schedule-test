package com.shandiangou.scheduletest.springSchedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 支持cron表达式
 */
@Component
public class SpringScheduleTest {
    @Scheduled(cron = "0/5 * * * * ?")
    public void testSpringSchedule() {
        System.out.println("Hello SpringSchedule!");
    }
}
