package me.alphar.springcloud.payment.controller;

import me.alphar.springcloud.common.entities.CommonResult;
import me.alphar.springcloud.common.entities.Payment;
import me.alphar.springcloud.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:36
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private IPaymentService paymentService;

    @PostMapping
    public CommonResult save(Payment payment) {
        int result = paymentService.save(payment);
        return new CommonResult(1, "successful", result);
    }

    @GetMapping("{tid}")
    public CommonResult<Payment> getById(@PathVariable("tid") Long tid) {
        Payment result = paymentService.getById(tid);
        return new CommonResult<>(1, "successful", result);
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("zk")
    public String paymentZk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
