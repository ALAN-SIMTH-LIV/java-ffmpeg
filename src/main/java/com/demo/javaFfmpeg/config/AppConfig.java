package com.demo.javaFfmpeg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${showFFmegLog:true}")
    private Boolean showFFmpegLog;

    public Boolean getShowFFmpegLog() {
        return showFFmpegLog;
    }
}
