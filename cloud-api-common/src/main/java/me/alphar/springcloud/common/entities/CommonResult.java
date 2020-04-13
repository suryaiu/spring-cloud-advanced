package me.alphar.springcloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:17
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }
}
