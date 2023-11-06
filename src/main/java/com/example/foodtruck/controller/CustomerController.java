package com.example.foodtruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodtruck.pojo.Customer;
import com.example.foodtruck.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    //Consider what goes here
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id){
        return new ResponseEntity<>(customerService.getCustomerById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.saveCustomer(customer),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<>(customerService.getCustomers(),HttpStatus.OK);
    }

}
