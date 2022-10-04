package com.yyy.WalletLocker.controller;

import com.yyy.WalletLocker.model.LoanData;
import com.yyy.WalletLocker.model.User;
import com.yyy.WalletLocker.service.LoanService;
import com.yyy.WalletLocker.service.UserService;
import com.yyy.WalletLocker.util.JsonResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：10:24 上午, 2022/10/4,10,2022
 * @Modified By:
 */
@RestController
@RequestMapping("/loan")
public class LoanManageController {

    @Resource
    private LoanService loanService;

    @RequestMapping(method = RequestMethod.PUT)
    public JsonResponse registerNewUser(@RequestBody LoanData loanData){
        int i = loanService.addLoanInfo(loanData);
        return i >=0 ?new JsonResponse("200"):new JsonResponse("400");
    }
}
