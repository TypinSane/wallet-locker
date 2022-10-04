package com.yyy.WalletLocker.controller;

import com.yyy.WalletLocker.model.User;
import com.yyy.WalletLocker.service.UserService;
import com.yyy.WalletLocker.util.ExcelUtils;
import com.yyy.WalletLocker.util.JsonResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


/**
 * @Author：yuanyao
 * @Description:
 * @Time：10:54 下午, 2021/5/17,05,2021
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserManageController {

    @Resource
    private UserService userService;

    @Resource
    private ExcelUtils excelUtils;

    @RequestMapping(method = RequestMethod.PUT)
    public JsonResponse registerNewUser(@RequestBody User user){
        int i = userService.addNewUser(user);
        return i >=0 ?new JsonResponse("200"):new JsonResponse("400");
    }

    @RequestMapping(value = "/checkin",method = RequestMethod.PUT)
    public JsonResponse<Boolean> login(@RequestBody User user){
        return userService.findUser(user);
    }

    @RequestMapping(method = RequestMethod.GET,value = "downLoadExcel")
    public void downLoadExcel(HttpServletResponse response){
        excelUtils.downLoadExcel(response);
    }

}
