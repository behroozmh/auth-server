package com.behi.sec.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myconfig.properties")
@Getter
public class Dashboard {
    @Value("${login.path}")
    private String loginPath;
}
