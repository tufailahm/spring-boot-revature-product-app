package com.revature.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.training.pms.model.Product;

@RestController
@RequestMapping("pp")
public class AhmedController {

	
	//@GetMapping("/hello)
	@RequestMapping( value =  "/hello" , method = RequestMethod.POST  )
	
	@PostMapping("/hello")
	public void getEmployee() {
		
	}
	@PutMapping
	public void updateEmployees(@RequestBody Product product) {
			//update code
	}
}

//http://localhost:9090/employees	-GET,PUT

//http://localhost:9090/pp/hello	-POST