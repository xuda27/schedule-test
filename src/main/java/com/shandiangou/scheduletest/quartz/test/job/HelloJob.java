package com.shandiangou.scheduletest.quartz.test.job;

import org.quartz.*;

@DisallowConcurrentExecution // 禁止并发执行
@PersistJobDataAfterExecution // 保持任务数据直到执行完成
public class HelloJob implements Job {
    public HelloJob() {
    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.err.println("Hello!  HelloJob is executing.");
    }
}
