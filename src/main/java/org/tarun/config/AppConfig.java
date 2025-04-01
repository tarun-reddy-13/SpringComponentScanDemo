package org.tarun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.tarun.Interfaces.MobileProcessor;
import org.tarun.components.Samsung;
import org.tarun.components.Snapdragon;

@Configuration
@ComponentScan(basePackages = "org.tarun.components")
public class AppConfig {
/*
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }
 */
}
