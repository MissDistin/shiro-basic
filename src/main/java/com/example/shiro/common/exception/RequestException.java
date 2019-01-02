package com.example.shiro.common.exception;

import com.example.shiro.common.bean.ResponseCode;
import lombok.*;

import java.io.Serializable;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 10:56
 * @Description: 异常捕获
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestException extends RuntimeException implements Serializable {

    private Integer status;
    private String msg;
    private Exception e;

    public RequestException(ResponseCode statusEnum, Exception e) {
        this.status = statusEnum.code;
        this.msg = statusEnum.msg;
        this.e = e;
    }


    public RequestException(ResponseCode statusEnum) {
        this.status = statusEnum.code;
        this.msg = statusEnum.msg;
    }

    public synchronized static RequestException fail(String msg){
        return RequestException.builder()
                .status(ResponseCode.FAIL.code)
                .msg(msg)
                .build();
    }

    public synchronized static RequestException fail(String msg,Exception e){
        return RequestException.builder()
                .status(ResponseCode.FAIL.code)
                .msg(msg)
                .e(e)
                .build();
    }

    public synchronized static RequestException fail(Integer code,String msg,Exception e){
        return RequestException.builder()
                .status(code)
                .msg(msg)
                .e(e)
                .build();
    }
}
