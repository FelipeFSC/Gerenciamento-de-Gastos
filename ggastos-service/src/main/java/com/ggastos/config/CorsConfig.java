package com.ggastos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 *
 * @author Miguel Castro
 */
@Configuration
public class CorsConfig {
    
    public void addCors(CorsRegistry registry) {
        
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
