package cz.zdenek.demo.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cz.zdenek.demo.rest.dto.CustomerDto;
import cz.zdenek.demo.rest.dto.QuotationDto;
import cz.zdenek.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;

/**
 * Endpoint for working with customers.
 *
 * @author zdenekhak
 */
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    /**
     * Updating customer attributes.
     */
    @PatchMapping("/customers")
    public void udpateCustomer(@Valid @RequestBody CustomerDto customerDto) {

    }

    /**
     * Finds all customers.
     */
    @GetMapping("/customers")
    public List<CustomerDto> findAllCustomers() {

        var customers =  customerService.findAll();

        customers.stream().forEach(System.out::println);

        var cust1= customers.stream().filter(a -> a.getFirstName().equals("A")).collect(Collectors.toList());
        cust1.stream().forEach(System.out::println);

        return customers;
    }
}
