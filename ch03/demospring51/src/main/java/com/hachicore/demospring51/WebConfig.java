package com.hachicore.demospring51;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addFormatters(FormatterRegistry registry) {
    // registry.addConverter(new EventConverter.StringToEventConverter());
    registry.addFormatter(new EventFormatter());
  }
}
