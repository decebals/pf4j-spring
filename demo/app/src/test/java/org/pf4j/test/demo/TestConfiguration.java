package org.pf4j.test.demo;

import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean
    public SpringPluginManager pluginManager() {
        return new SpringPluginManager();
    }
}
