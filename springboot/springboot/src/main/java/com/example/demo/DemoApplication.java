package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
		DemoService demoService=(DemoService) applicationContext.getBean("demoService");
		SessionService sessionService=(SessionService) applicationContext.getBean("sessionService") ;
		demoService.createDemo();
		sessionService.createSession();

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		ExecuteService executeService=context.getBean(ExecuteService.class);
		executeService.PrimaryEx();
	}

}
