package com.example.demo;

import com.example.demo.entity.LibraryLedger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(DemoApplication.class, args);
//		LibraryLedger libraryLedger=applicationContext.getBean(LibraryLedger.class);
//		System.out.println("Hello world");
	}

}
