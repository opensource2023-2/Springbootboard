package com.example.springboot_board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public void index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
}
