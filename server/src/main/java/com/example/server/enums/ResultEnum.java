package com.example.server.enums;

import lombok.Getter;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 8:25 PM
 */
@Getter
public enum ResultEnum {

    SUCCESS(100, "success"),

    ERROR(200, "failed"),




    ;


    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
