package com.shandiangou.scheduletest.quartz.dao;

import com.shandiangou.scheduletest.quartz.domain.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface JobAndTriggerMapper {
     List<JobAndTrigger> getJobAndTriggerDetails();
}
