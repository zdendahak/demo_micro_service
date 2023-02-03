package cz.zdenek.demo.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents information about a subscription.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDto {

    private Integer id;

    private QuotationDto quotationDto;

    private LocalDate startDate;

    private LocalDate validUntil;
}
