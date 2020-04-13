package me.alphar.springcloud.lbrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ribbon 自定义负载规则
 */
@Configuration
public class LoadBalanceRule {
    @Bean
    public IRule myRole() {
        return new RandomRule();
    }
}
