package kr.co.mycom.git_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SNSController {
    @GetMapping("/snsMain")
    public String snsMain() {
        return "snsMain";
    }
}
