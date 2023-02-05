package cz.zdenek.demo.rest.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cz.zdenek.demo.rest.dto.CustomerDto;
import cz.zdenek.demo.rest.dto.QuotationDto;

/**
 * Endpoint for working with customers.
 *
 * @author zdenekhak
 */
public class CustomerController {

    /**
     * Updating customer attributes.
     */
    @PatchMapping("/customers")
    public void udpateCustomer(@Valid @RequestBody CustomerDto customerDto) {

    }
}
