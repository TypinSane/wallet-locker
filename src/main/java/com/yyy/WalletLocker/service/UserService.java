package com.yyy.WalletLocker.service;

import com.yyy.WalletLocker.model.User;
import com.yyy.WalletLocker.util.JsonResponse;

import java.util.List;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：11:49 下午, 2021/5/18,05,2021
 * @Modified By:
 */
public interface UserService {
    int addNewUser(User user);

    List<User> getAllUser();

    JsonResponse<Boolean> findUser(User user);
}
