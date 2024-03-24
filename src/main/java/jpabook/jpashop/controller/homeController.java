package jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j  // logFactory인듯 로그설정.
public class homeController {

    @RequestMapping("/")
    public String home(){
        log.info("home controller");
        return "home";
    }

}
