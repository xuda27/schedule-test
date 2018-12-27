package com.shandiangou.scheduletest.quartz.test.job;

import org.quartz.*;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class HelloJob implements Job {
    public HelloJob() {
    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.err.println("Hello!  HelloJob is executing.");
    }
}
