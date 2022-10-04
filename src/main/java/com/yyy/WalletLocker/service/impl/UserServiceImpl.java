package com.yyy.WalletLocker.service.impl;

import com.yyy.WalletLocker.mapper.UserMapper;
import com.yyy.WalletLocker.model.User;
import com.yyy.WalletLocker.service.UserService;
import com.yyy.WalletLocker.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.List;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：11:53 下午, 2021/5/18,05,2021
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addNewUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    @Override
    public JsonResponse<Boolean> findUser(User user) {
        int i = userMapper.getUserByIdAndPwd(user);
        JsonResponse<Boolean> objectResponse = new JsonResponse<Boolean>();
        if(i>0){
            objectResponse.setContent(true);
        }else{
            objectResponse.setContent(false);
        }
        return objectResponse;
    }
}
