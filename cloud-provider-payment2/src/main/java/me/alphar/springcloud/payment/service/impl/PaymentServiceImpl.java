package me.alphar.springcloud.payment.service.impl;

import me.alphar.springcloud.common.entities.Payment;
import me.alphar.springcloud.payment.dao.PaymentDao;
import me.alphar.springcloud.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
