package me.alphar.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Payment2Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment2Application.class);
    }
}
