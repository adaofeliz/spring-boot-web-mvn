package com.adaofeliz.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created on 19/11/14.
 */

@EnableWebMvc
@ComponentScan("com.adaofeliz")
@EnableAutoConfiguration
public class AppConfig {
}
