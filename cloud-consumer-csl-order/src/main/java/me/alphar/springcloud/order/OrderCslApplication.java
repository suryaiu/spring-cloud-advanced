package me.alphar.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderCslApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderCslApplication.class);
    }
}
