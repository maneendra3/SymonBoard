package com.kohls.symon.board;

import com.kohls.symon.board.config.SchedulerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.kohls.symon.board"})
@Import({ SchedulerConfig.class })
public class SymonBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SymonBoardApplication.class, args);
    }
}
