package me.alphar.springcloud.order.service;

import me.alphar.springcloud.common.entities.CommonResult;
import me.alphar.springcloud.common.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/{tid}")
    CommonResult<Payment> getById(@PathVariable("tid") Long tid);
}