package me.alphar.springcloud.payment.service;

import me.alphar.springcloud.common.entities.Payment;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:34
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
public interface IPaymentService {
    int save(Payment payment);
    Payment getById(Long tid);
}
