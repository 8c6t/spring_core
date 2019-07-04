package com.hachicore.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext messageSource; // MessageSource를 상속받고 있기 때문에 가능
    // MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while(true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"Hachicore"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Hachicore"}, Locale.getDefault()));
            Thread.sleep(1000);
        }

    }
}
