package com.wanghb.test.dataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wanghb
 * @since 2020/6/18 11:01 上午
 */
@EnableHasor()
@EnableHasorWeb()
//@SpringBootApplication(scanBasePackages = { "net.example.hasor" })
@SpringBootApplication(scanBasePackages = { "com.wanghb.test" })
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}