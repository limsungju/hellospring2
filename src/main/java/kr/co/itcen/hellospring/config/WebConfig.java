package kr.co.itcen.hellospring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"kr.co.itcen.hellospring.controller"}) // auto-scan
public class WebConfig {
	
}
