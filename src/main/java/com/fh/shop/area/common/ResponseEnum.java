package com.fh.shop.area.common;

public enum ResponseEnum {

    ORDER_ERROR_CHAOMAI(2500, "库存不足"),

    ORDER_ERROR_EXCPETION(2501, "出现未知异常，导致失败"),

    ORDER_SUCCESS_QUEUE(2502, "排队中..........."),

    GOODS_DONT_EXIST(3000, "商品不存在"),

    ORDER_HEND_NO(888, "token丢失，不存在"),

    REDIS_KEY_NO(882, "redis中没有这个key，不能在提交"),

    THE_MERCHANDISE_IS_OFF_THE_SHELVES(3001, "商品已下架"),

    HEADER_INFORMATION_AVAILABLE(5000, "头信息有空值"),

    ERROR_IN_QUANTITY(5004, "商品数量异常"),

    TREPEATED_REQUESTS(5003, "重复请求"),

    THE_REQUEST_TIMEOUT(5002, "请求超时"),

    SECURE_DATA_IS_CHANGE(5001, "数据被篡改"),

    IDS_IS_NULL(5009, "ids为空"),

    MEMBER_INFO_IS_NULL(8000, "会员注册输入的信息为空"),

    HEADER_IS_MISS(6001, "头信息丢失"),

    HEADER_CONTENT_IS_MISS(6000, "头信息不完整"),

    DATA_IS_CHANGE(6002, "数据被篡改"),

    LOGIN_IS_TIMEOUT(6003, "登录超时"),

    LOGIN_NAME_AND_PWD_ISNULL(8020, "登录时用户名或者密码为空"),

    MEMBER_IS_NULL(8050, "用户不存在"),

    MEMBER_PWD_IS_NOT(8030, "密码错误"),

    MEMBER_NAME_IS_NULL(8004, "会员名为空"),

    MAIL_IS_NULL(8005, "邮箱为空"),

    PHONE_IS_NULL(8006, "电话为空"),

    MEMBER_NAME_IS_EXIST(9000, "会员名已被注册"),

    PHONE_IS_EXIST(7000, "手机号已注册"),

    MAIL_IS_EXIST(7000, "邮箱已注册"),

    CAR_IDS_ISNULL(2011, "ids为空");


    private int code;

    private String msg;

    private ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
