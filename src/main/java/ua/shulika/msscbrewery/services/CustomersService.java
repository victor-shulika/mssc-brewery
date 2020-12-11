package ua.shulika.msscbrewery.services;

import ua.shulika.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomersService {
    CustomerDto getCustomer(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
