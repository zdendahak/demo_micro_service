package cz.zdenek.demo.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import cz.zdenek.demo.rest.controller.CustomerController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents information about a quotation.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuotationDto {

    private Integer id;

    private LocalDate beginingOfInsurance;

    private BigDecimal insuredAmount;

    private LocalDate dateOfSigningMortage;

    private CustomerDto customerDto;
}
