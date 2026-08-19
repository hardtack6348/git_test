package kr.co.mycom.git_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @RequestMapping("/greeting")
    public String greeting(){
        return "안녕하시렵니까";
    }
}
