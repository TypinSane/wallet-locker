package com.yyy.WalletLocker.mapper;

import com.yyy.WalletLocker.model.LoanData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanData record);

    int insertSelective(LoanData record);

    LoanData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanData record);

    int updateByPrimaryKey(LoanData record);
}