package cz.zdenek.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.zdenek.demo.repository.CustomerRepository;
import cz.zdenek.demo.rest.dto.CustomerDto;
import cz.zdenek.demo.service.CustomerService;
import cz.zdenek.demo.service.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;

/**
 * Service layer for management of customers.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    @Transactional(readOnly = true)
    public List<CustomerDto> findAll() {

        var customers = customerRepository.findAll();
        var customerDto = customers.stream().map(customerMapper::toAuthorDto).collect(Collectors.toList());

        return customerDto;
    }
}
