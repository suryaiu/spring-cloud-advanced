package me.alphar.springcloud.order.controller;

import me.alphar.springcloud.common.entities.CommonResult;
import me.alphar.springcloud.common.entities.Payment;
import me.alphar.springcloud.order.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("{tid}")
    public CommonResult<Payment> getById(@PathVariable("tid") Long tid) {
        CommonResult<Payment> result = paymentFeignService.getById(tid);
        return result;
    }
}
