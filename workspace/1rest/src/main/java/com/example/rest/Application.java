package com.example.rest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	private ArrayList<String> listDos = new ArrayList<String>();
	
	@GetMapping("/dos")
	public ArrayList<String> getDos() {
		return listDos;
	}
	
	@PostMapping("/dos/{doV}")
	public String addDo(@PathVariable String doV) {
		listDos.add(doV);
		return "added";
	}
	
	@DeleteMapping("/dos/{doV}")
	public String deleteDo(@PathVariable String doV) {
		listDos.remove(doV);
		return "deleted";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
