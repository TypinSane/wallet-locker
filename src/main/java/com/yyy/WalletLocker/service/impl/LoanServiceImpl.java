package com.yyy.WalletLocker.service.impl;

import com.yyy.WalletLocker.mapper.LoanMapper;
import com.yyy.WalletLocker.model.LoanData;
import com.yyy.WalletLocker.service.LoanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：10:28 上午, 2022/10/4,10,2022
 * @Modified By:
 */
@Service
public class LoanServiceImpl implements LoanService {

    @Resource
    private LoanMapper loanMapper;

    @Override
    public int addLoanInfo(LoanData loanData) {
        int i = loanMapper.insertSelective(loanData);
        return i;
    }

    @Override
    public LoanData selectLoanById(int id) {
        LoanData loanData = loanMapper.selectByPrimaryKey(id);
        return loanData;
    }

    @Override
    public int deleteById(int id) {
        int i = loanMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int updateLoanData(LoanData loanData) {
        int i = loanMapper.updateByPrimaryKeySelective(loanData);
        return i;
    }


}
