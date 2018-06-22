package com.kohls.symon.board.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.kohls.symon.board" })
public class SymonBoardApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SymonBoardApplication.class, args);
    }
}
