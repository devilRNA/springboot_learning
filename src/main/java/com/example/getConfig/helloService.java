package com.example.getConfig;


import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class helloService {

    helloService(){
        System.out.println("我被实例化了！");
    }

    public String getHello(){
        return "你好！鸟鸟鸟袅袅！";
    }

    public String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return "现在时间：" + sdf.format(date);
    }
}
