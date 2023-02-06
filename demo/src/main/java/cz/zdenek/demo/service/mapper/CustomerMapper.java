package cz.zdenek.demo.service.mapper;

import org.mapstruct.Mapper;

import cz.zdenek.demo.model.CustomerEntity;
import cz.zdenek.demo.rest.dto.CustomerDto;

/**
 * Mapper between {@link CustomerEntity} and CustomerDto.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto toAuthorDto(CustomerEntity customerEntity);
}
