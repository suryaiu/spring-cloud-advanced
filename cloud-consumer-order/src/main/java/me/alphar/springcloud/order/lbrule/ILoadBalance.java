package me.alphar.springcloud.order.lbrule;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface ILoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
