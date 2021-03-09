package com.pluralsight.fundamentals;

import com.pluralsight.fundamentals.controller.FundamentalsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		FundamentalsController fundamentalsController = new FundamentalsController();
		fundamentalsController.print();
	}
}
