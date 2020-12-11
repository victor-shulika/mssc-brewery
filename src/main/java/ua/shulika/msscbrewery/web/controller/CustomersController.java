package ua.shulika.msscbrewery.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.shulika.msscbrewery.services.CustomersService;
import ua.shulika.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@RequestMapping("/api/v1/customers")
@RestController
public class CustomersController {
    private final CustomersService customersService;

    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customersService.getCustomer(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customersService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customers/" + savedCustomer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {
        customersService.updateCustomer(customerId, customerDto);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
        customersService.deleteCustomer(customerId);
    }
}
