package com.ccsw.tutorial_customer.customer;

import com.ccsw.tutorial_customer.customer.model.Customer;
import com.ccsw.tutorial_customer.customer.model.CustomerDto;
import com.ccsw.tutorial_customer.exceptions.CustomerNotFoundException;
import com.ccsw.tutorial_customer.exceptions.NameAlreadyExistsException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ana Piqueras
 *
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer get(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not exists"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Customer> findAll() {

        return (List<Customer>) this.customerRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, CustomerDto dto) {

        if (customerRepository.existsByName(dto.getName())) {
            throw new NameAlreadyExistsException("Invalid name");
        }

        Customer customer;
        customer = (id == null) ? new Customer() : this.get(id);
        customer.setName(dto.getName());
        this.customerRepository.save(customer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {
        this.get(id);
        this.customerRepository.deleteById(id);
    }
}
