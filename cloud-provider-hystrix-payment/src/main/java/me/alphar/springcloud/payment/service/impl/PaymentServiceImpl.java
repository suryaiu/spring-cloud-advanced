package me.alphar.springcloud.payment.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import me.alphar.springcloud.common.entities.Payment;
import me.alphar.springcloud.payment.dao.PaymentDao;
import me.alphar.springcloud.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:34
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getById(Long tid) {
        return paymentDao.getById(tid);
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK, id: " + id + "\t" + "~";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_Timeout(Integer id) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int a = 10/0;
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_Timeout, id: " + id + "\t" + "~";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + ", 系统繁忙，请稍后再试！";
    }
}
