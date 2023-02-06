package cz.zdenek.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import cz.zdenek.demo.rest.dto.CustomerDto;

public interface CustomerService {

    List<CustomerDto> findAll();
}
