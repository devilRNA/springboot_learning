package com.example.getConfig;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Config class
 * */

@Component  //交给springboot 管理，之后可以用@Autowried 装配
@Data //lombok的一个插件，省略了构造/get/set的方法
public class configEntity {
    @Value("${my-profile.name}")
    String name;

    @Value("${my-profile.email}")
    String email;

    @Value("${my-profile.words}")
    String words;

    @Value("${my-profile.random}")
    String random;

}
