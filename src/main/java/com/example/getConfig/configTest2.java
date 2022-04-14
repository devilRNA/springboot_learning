
package com.example.getConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: DevilRNA
 * TEST 2: GET config data in multi-controller by using configEntity
 *
 * */


@RestController
public class configTest2 {
    @Autowired
    private configEntity configEntity;

    @GetMapping("myweiwei")
    public configEntity weiwei(){
        return configEntity;
    }

    @Autowired
    private helloService helloService;

    @GetMapping("gethello")
    public String wwww(){
        return helloService.getHello();
    }

    @GetMapping("getTime")
    public String sss(){
        return helloService.getTime();
    }


}
