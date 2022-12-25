package com.behi.sec.service.impl;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;

public class RememberMeServiceImpl extends TokenBasedRememberMeServices {
    public RememberMeServiceImpl(String key, UserDetailsService userDetailsService) {
        super(key, userDetailsService);
    }
}
