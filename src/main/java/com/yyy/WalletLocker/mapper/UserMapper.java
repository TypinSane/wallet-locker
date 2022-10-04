package com.yyy.WalletLocker.mapper;

import com.yyy.WalletLocker.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    List<User> getAllUser();

    int getUserByIdAndPwd(User user);
}