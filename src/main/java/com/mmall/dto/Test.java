package com.mmall.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Administrator
 * @projectName: Permission
 * @className: Test
 * @date: 2019/06/01 14:59
 * @description:
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(s.format(new Date()));

        String str = "2014-07-09 10:48:23";
        Date d = s.parse(str);
        System.out.println(s.format(d));
    }
}