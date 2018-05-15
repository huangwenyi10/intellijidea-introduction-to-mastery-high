package com.ay.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ay
 * @create 2018/05/14
 **/
@Controller
@RequestMapping("test")
public class AyTestController {


    @RequestMapping("/hello")
    public void hello(){
        System.out.println("ay");
    }

}
