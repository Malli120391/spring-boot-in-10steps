package com.malli.sprinboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControl {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1L, "JavaSpringtest", "SpringBoot"));
		
	}

}
