
package com.example.getConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: DevilRNA
 * TEST 1: GET config data in single controller directly
 * to make it happen ,you may need to apply @Comment @Data ,so that you can use @Value
 * pls notice that @Value's package should be org.springframework.beans.factory.annotation.Value;
 * rather than lombok.Value etc.
 *
 * */


@RestController
public class configTest1 {
    // get config  from application.properties
    @Value("${com.hit.nationalHoliday}")
    String shit;

    // get config  from application.yml
    @Value("${my-profile.name}")
    String city;



    @GetMapping("/hello")
    public String returnHello(){
        return "hello";
    }

    @GetMapping("holiday")
    public String holiday(){
    return shit;
    }

    @GetMapping("city")
    public String wuhan(){
        return city;
    }

}
