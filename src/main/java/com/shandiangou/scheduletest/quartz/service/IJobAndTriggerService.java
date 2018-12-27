package com.shandiangou.scheduletest.quartz.service;

import com.github.pagehelper.PageInfo;
import com.shandiangou.scheduletest.quartz.domain.JobAndTrigger;

public interface IJobAndTriggerService {
    PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
