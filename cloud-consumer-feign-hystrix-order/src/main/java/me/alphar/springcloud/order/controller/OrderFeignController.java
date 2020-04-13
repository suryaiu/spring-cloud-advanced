package me.alphar.springcloud.order.controller;

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

    @GetMapping("/ok/{tid}")
    public String ok(@PathVariable("tid") Integer tid) {
        String result = paymentFeignService.ok(tid);
        return result;
    }

    @GetMapping("/error/{tid}")
    public String error(@PathVariable("tid") Integer tid) {
        String result = paymentFeignService.error(tid);
        return result;
    }
}
