package com.behi.sec.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * create User: behrooz.mh
 * Date: 12/28/2022
 * TIME: 12:57 PM
 **/
@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(HttpServletRequest servletRequest) {
        HttpSession session = servletRequest.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            log.info("######### username={0} #########", username);
        }
        return "home";
    }
}
