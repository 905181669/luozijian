package com.example.demo.common.rest;

import com.example.demo.common.base.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@ApiModel(value = "容器对象，业务内容统一存在data字段中")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RespResult<T> {

    @ApiModelProperty(value = "接口响应状态码", required = true)
    private int code;

    @ApiModelProperty(value = "统一在data结点返回数据")
    private T data;

    @ApiModelProperty(value = "返回结果的提示信息", required = true)
    private String message;


    public RespResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public RespResult(Status status, String message, T data) {
        this.code = status.code();
        this.message = message;
        this.data = data;
    }


    public static RespResult success(Object result) {
        return new RespResult(Status.SUCCESS.code(), Status.SUCCESS.getMessage(), result);
    }

    public static RespResult success(Status status, String message) {
        return new RespResult(status.getCode(), message, (Object)null);
    }

    public static RespResult success(Object... results) {
        Map<String, Object> dataMap = new HashMap();

        for(int i = 0; i < results.length; ++i) {
            dataMap.put("data" + (i + 1), results[i]);
        }

        return new RespResult(Status.SUCCESS.code(), Status.SUCCESS.getMessage(), dataMap);
    }

    public static RespResult success() {
        return new RespResult(Status.SUCCESS.code(), Status.SUCCESS.getMessage(), (Object)null);
    }

    public static RespResult error(String msg) {
        return new RespResult(Status.BUSY.code(), msg, (Object)null);
    }

    public static RespResult error(Status status) {
        return new RespResult(status.getCode(), status.getMessage(), (Object)null);
    }

    public static RespResult error(Status status, String msg) {
        return new RespResult(status.getCode(), msg, (Object)null);
    }


    public static RespResult error(int code, String msg) {
        return new RespResult(code, msg, (Object)null);
    }





}
