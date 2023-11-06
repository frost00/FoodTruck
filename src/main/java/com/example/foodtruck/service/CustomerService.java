package com.example.foodtruck.service;

import java.util.List;

import com.example.foodtruck.pojo.Customer;

public interface CustomerService {

    Customer getCustomerById(String id);
    Customer saveCustomer(Customer customer);
    void updateCustomer(String id,Customer customer);
    void deleteCustomer(String id);
    List<Customer> getCustomers();

}
