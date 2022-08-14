package com.behi.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getLogin(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String postLogin(){
        return "login";
    }


    @RequestMapping(value = "/lwm",method = RequestMethod.GET)
    public String getLoginWithMobile(ModelAndView model){
        return "loginWithMobile";
    }

    @RequestMapping(value = "/lwm",method = RequestMethod.POST)
    public String postLoginWithMobile(ModelAndView model){
        return "loginWithMobile";
    }


}
