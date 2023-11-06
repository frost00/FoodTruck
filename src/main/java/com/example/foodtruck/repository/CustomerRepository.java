package com.example.foodtruck.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.foodtruck.pojo.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String>{
    
}