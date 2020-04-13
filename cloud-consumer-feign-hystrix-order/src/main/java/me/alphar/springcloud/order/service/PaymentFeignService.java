package me.alphar.springcloud.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("HYSTRIX-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/ok/{tid}")
    String ok(@PathVariable("tid") Integer tid);

    @GetMapping("/payment/error/{tid}")
    String error(@PathVariable("tid") Integer tid);
}