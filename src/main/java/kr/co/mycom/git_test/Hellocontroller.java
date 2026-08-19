package kr.co.mycom.git_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        String str = "Hello World! team1 sch11";

        return "Hello World";
    }
}
