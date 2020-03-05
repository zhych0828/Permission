package com.mmall.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Administrator
 * @projectName: Permission
 * @className: testE
 * @date: 2019/06/14 12:24
 * @description:
 */
public class testE {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String ww = dateFormat.format(now);
        String aa = "客户今天不来了";
        System.out.println("\n" + ww + " ~ " + "{ " + aa + " }");
    }
}