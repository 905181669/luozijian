package com.example.demo.common.base;

public enum Status {
    SUCCESS(200, "操作成功"),
    PARAMS_FORMAT_ERROR(400, "请求参数格式有误"),
    HTTP_NOT_FOUND(404, "请求的资源不存在"),
    HTTP_503_ERROR(503, "请求服务不可用"),
    PARAMS_IS_BLANK(451, "参数不能为空"),
    PARAMS_OUT_OF_RANGE_ERROR(452, "参数值超出范围值"),
    BUSY(500, "系统繁忙"),
    ZCS_REQUEST_ERROR(501, "ZCS网关请求失败"),
    SESSION_TIMEOUT(502, "登陆超时，请重新登录"),
    OBJECT_NOT_EXIST(503, "对象不存在"),
    I18N_MESSAGE_NOT_FOUND(504, "i18N MESSAGE NOT FOUND"),
    OPERATION_NOT_SUPPORT(505, "不支持的操作"),
    SERIALIZATION_EXCEPTION(506, "对象序列号异常"),
    REQUEST_OVER_LIMIT(507, "限流接口,并发请求次数超出范围"),
    ILLEGAL_ARGUMENT(508, "参数不合法");

    private int code;
    private String message;

    private Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public int code() {
        return this.code;
    }

    public static Status getStatusByCode(int code) {
        Status[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Status status = var1[var3];
            if (status.getCode() == code) {
                return status;
            }
        }

        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public static boolean isSuccess(Status status) {
        return SUCCESS == status;
    }
}

