package com.fzj.fjts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fzj")
public class FjtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FjtsApplication.class, args);
    }

}
