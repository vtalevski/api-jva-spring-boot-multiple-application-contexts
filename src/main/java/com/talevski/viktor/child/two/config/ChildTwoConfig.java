package com.talevski.viktor.child.two.config;

import com.talevski.viktor.parent.config.YmlPropertySourceFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.talevski.viktor.child.two")
@PropertySource(value = "classpath:bootstrap-child-two.yml", factory = YmlPropertySourceFactory.class)
@EnableAutoConfiguration
public class ChildTwoConfig {
}
