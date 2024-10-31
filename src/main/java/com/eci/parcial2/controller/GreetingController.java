
package com.eci.parcial2.controller;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

import com.eci.parcial2.services.linearSearchC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
        
        @GetMapping("/linearSearch")
        public String linearSearch(@RequestParam(value = "list")String lista, @RequestParam(value = "value" )long numero ) {

			return  new linearSearchC().linearSearchFunction(lista, numero);


		}
        
        
}


