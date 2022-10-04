package com.yyy.WalletLocker.util;

import com.yyy.WalletLocker.model.User;
import com.yyy.WalletLocker.service.UserService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：7:27 下午, 2021/5/23,05,2021
 * @Modified By:
 */
@Service
public class ExcelUtils {

    @Resource
    private UserService userService;

    public void downLoadExcel(HttpServletResponse response){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet infoTable = workbook.createSheet("信息表");

        List<User> users = userService.getAllUser();

        String fileName = "userInfo"+".xls";

        int rowNum = 1;

        String[] headers = {"姓名","电话","身份证号","email","昵称","地址","创建时间","更新时间"};

        HSSFRow row = infoTable.createRow(0);

        for(int i =0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString hssfRichTextString = new HSSFRichTextString(headers[i]);
            cell.setCellValue(hssfRichTextString);
        }

        for (User user : users) {
            int cellNum = 0;
            HSSFRow row1 = infoTable.createRow(rowNum);
            row1.createCell(cellNum++).setCellValue(user.getUsername());
            row1.createCell(cellNum++).setCellValue(user.getPhoneNum());
            row1.createCell(cellNum++).setCellValue(user.getIdentifyNum());
            row1.createCell(cellNum++).setCellValue(user.getEmail());
            row1.createCell(cellNum++).setCellValue(user.getNickName());
            row1.createCell(cellNum++).setCellValue(user.getAddr());
            row1.createCell(cellNum++).setCellValue(user.getCrtTime());
            row1.createCell(cellNum++).setCellValue(user.getUpdTime());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition","attachment;filename="+fileName);

        try{
            response.flushBuffer();
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
