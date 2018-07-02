package com.kohls.symon.board.jobs;

import com.kohls.symon.board.service.PullSQLDataService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PullMysqlDataJob implements Job {

    @Autowired
    private PullSQLDataService pullSQLDataService;


    public void execute(JobExecutionContext jobExecutionContext) {
        pullSQLDataService.copyLEDOfficeData();
        pullSQLDataService.copyLEDBoardData();
    }


}
