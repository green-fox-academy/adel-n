package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.services.Printer;
import com.greenfoxacademy.hellobeanworld.services.colors.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner{
	@Autowired
  Printer printer;

	@Autowired
  RedColor redColor;

	public static void main(String[] args) {
		SpringApplication.run(HelloBeanWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printer.log("hei!");
		redColor.printColor();
	}
}


