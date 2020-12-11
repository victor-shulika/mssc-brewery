package ua.shulika.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ua.shulika.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomersServiceImpl implements CustomersService {

    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("New Customer")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer...");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
