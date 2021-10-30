package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello()
	{
		return "Hello Bangalore";
	}
	
	@GetMapping("/cities")
	public List<String> getCities()
	{
		List<String> list = new ArrayList<>();
		
		list.add("ATP");
		list.add("HYD");
		list.add("BLR");
		
		
		return list;
	}
}
