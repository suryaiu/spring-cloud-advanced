package me.alphar.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Payment3Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment3Application.class);
    }
}
