package com.nuuptech.hellorest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	private static final String template = "Hola, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Mexico!") String name) {
		long c = counter.incrementAndGet();
		double result = 0;		
		//System.out.print("Hola");
		for (int x = 0; x < 10; x++) {
			result = factorial(20);
			System.out.print(x + ", ");
		}
		System.out.println(result);
		return new Greeting(c, String.format(template, name));
	}

	public double factorial (double numero) {
		if (numero==0)
		  return 1;
		else
		  return numero * factorial(numero-1);
	  }	  
}
