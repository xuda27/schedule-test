package com.shandiangou.scheduletest.quartz.test;

import com.shandiangou.scheduletest.quartz.test.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.JobBuilder.*;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;


public class QuartzTest {
    public static void main(String[] args) throws SchedulerException {
        // Grab the Scheduler instance from the Factory 创建scheduler
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.clear();

        // and start it off 启动
        scheduler.start();

        // define the job and tie it to our HelloJob class 根据Job创建Job实例
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();

        // Trigger the job to run now, and then repeat every 40 seconds 创建触发器
        Trigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(4)
                        .repeatForever())
                .build();

        // Tell quartz to schedule the job using our trigger 任务调用者通过使用触发器来触发任务执行
        scheduler.scheduleJob(job, trigger);
    }
}
