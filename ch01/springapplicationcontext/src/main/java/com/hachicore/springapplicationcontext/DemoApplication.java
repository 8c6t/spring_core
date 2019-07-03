package com.hachicore.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
  
  public static void main(String[] args) {

    // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    // ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    // String[] beanDefinitionNames = context.getBeanDefinitionNames();
    // System.out.println(Arrays.toString(beanDefinitionNames));

    // BookService bookService = (BookService) context.getBean("bookService");
    // System.out.println(bookService.bookRepository != null);

  }

}
