package com.example.server.VO;

import lombok.Data;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 7:41 PM
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;

}
