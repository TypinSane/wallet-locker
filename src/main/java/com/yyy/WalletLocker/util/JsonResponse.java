package com.yyy.WalletLocker.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：3:39 下午, 2021/5/9,05,2021
 * @Modified By:
 */
@Getter
@Setter
public class JsonResponse<T> {
    private String status;
    private String message;
    private T content;

    public JsonResponse() {};

    public JsonResponse(String status) {
        this.status = status;
        this.message = "success";
    }
}
