package com.talevski.viktor.child.one.config;

import com.talevski.viktor.child.one.service.ChildOneService;
import com.talevski.viktor.parent.config.YmlPropertySourceFactory;
import com.talevski.viktor.parent.service.ParentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.talevski.viktor.child.one")
@PropertySource(value = "classpath:bootstrap-child-one.yml", factory = YmlPropertySourceFactory.class)
@EnableAutoConfiguration
public class ChildOneConfig {

    @Bean
    public ParentService parentService() {
        return new ChildOneService();
    }
}
