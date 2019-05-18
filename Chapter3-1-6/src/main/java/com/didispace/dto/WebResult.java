package com.didispace.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author justZero
 * @since 2019/5/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebResult<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 1;

    private Integer code;
    private String message;
    private String url;
    private T data;
    private List<T> datas;
}
