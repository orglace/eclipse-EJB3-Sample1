package com.example.ejb.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.example.ejb.entity.Customer;

/**
 * Session Bean implementation class AccountService
 */
@Stateless
@LocalBean
public class AccountService implements AccountServiceRemote {

	@PersistenceContext(unitName = "Sample-EJB")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public AccountService() {
        // TODO Auto-generated constructor stub
    }
    
    
    @Override
    public Customer createAccount(String firstName, String lastName) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        
        em.persist(customer);
        
        return customer;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Customer> findAllCustomers() {
        
        TypedQuery<Customer> query = em.createQuery(
            "SELECT c FROM Customer c",Customer.class);
        
        return query.getResultList();
    }
}
