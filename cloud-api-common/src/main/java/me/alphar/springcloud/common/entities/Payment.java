package me.alphar.springcloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:09
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long tid;
    private String serial;
}
