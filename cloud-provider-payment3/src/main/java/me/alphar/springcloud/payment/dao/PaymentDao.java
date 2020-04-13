package me.alphar.springcloud.payment.dao;

import me.alphar.springcloud.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:19
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Mapper
public interface PaymentDao {
    int save(Payment payment);
    Payment getById(@Param("tid") Long tid);
}
