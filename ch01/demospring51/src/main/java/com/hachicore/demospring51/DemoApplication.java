package com.hachicore.demospring51;

import com.hachicore.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// Functional Bean Definition(MyService)
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
			if (true) {
				ctx.registerBean(MyService.class);
			}
			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition"));
		});
		app.run(args);
	}
}
