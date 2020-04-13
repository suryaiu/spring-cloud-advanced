package me.alphar.springcloud.order;

import me.alphar.springcloud.lbrule.LoadBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "payment-service", configuration = LoadBalanceRule.class)
@EnableEurekaClient
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
