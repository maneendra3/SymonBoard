package com.kohls.symon.board.jobs;

import com.kohls.symon.board.service.PullMysqlDataService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PullMysqlDataJob implements Job {

    @Autowired
    private PullMysqlDataService pullMysqlDataService;

    public void execute(JobExecutionContext jobExecutionContext){
        pullMysqlDataService.demoServiceMethod();
    }


}
