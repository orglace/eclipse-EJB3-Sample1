package com.example.ejb.service;

import java.util.List;

import javax.ejb.Remote;

import com.example.ejb.entity.Customer;

@Remote
public interface AccountServiceRemote {

	Customer createAccount(String firstName, String lastName);

	List<Customer> findAllCustomers();

}
