package com.hachicore.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

  @Autowired
  ConversionService conversionService;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(conversionService); // 컨버터 종류들
    System.out.println(conversionService.getClass().toString()); // org.springframework.boot.autoconfigure.web.format.WebConversionService
  }
}
