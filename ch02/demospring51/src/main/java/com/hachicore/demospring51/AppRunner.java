package com.hachicore.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(resourceLoader.getClass()); // AnnotationConfigServletWebServerApplicationContext

        // Resource resource = resourceLoader.getResource("classpath:test.txt");
        // System.out.println(resource.getClass()); // org.springframework.core.io.ClassPathResource(prefix)

        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println(resource.getClass()); // org.springframework.web.context.support.ServletContextResource

        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}