package kr.co.mycom.git_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Comment {
    @RequestMapping("/comment")
   public String comment(){
        return "commentList";
    }
}
