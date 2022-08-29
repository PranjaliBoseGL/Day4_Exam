package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController

	public class CustomerController {

	 @RequestMapping(value = "/customer", method = RequestMethod.GET)

	 public Customer firstPage() {

	 Customer cus = new Customer();

	 cus.setCustName("Pranjali");

	 cus.setDesignation("manager");

	 cus.setCustId("1");

	 cus.setSalary(3000);

	 return cus;

	 }

	}




