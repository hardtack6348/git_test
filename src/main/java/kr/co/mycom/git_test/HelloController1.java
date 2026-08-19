package kr.co.mycom.git_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello World");
        return "Hello Git World";
    }
}
