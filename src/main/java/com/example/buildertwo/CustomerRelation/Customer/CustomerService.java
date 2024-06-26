package com.example.buildertwo.CustomerRelation.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer crateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }



}
