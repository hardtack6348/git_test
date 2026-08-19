package kr.co.mycom.git_test;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Update {
    @RequestMapping
    public String update(){
        return "update";

    }

}
