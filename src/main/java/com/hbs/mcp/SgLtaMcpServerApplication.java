package com.hbs.mcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SgLtaMcpServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SgLtaMcpServerApplication.class, args);
    }
}
