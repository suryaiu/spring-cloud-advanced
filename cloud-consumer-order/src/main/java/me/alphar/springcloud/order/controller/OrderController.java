package me.alphar.springcloud.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    private static final String INVOKE_URL = "http://payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping
    public String test() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/test", String.class);
    }

}
