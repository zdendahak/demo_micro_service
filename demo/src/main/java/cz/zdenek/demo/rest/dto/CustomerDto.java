package cz.zdenek.demo.rest.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents information about a customer.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String phoneNumber;

    private LocalDate birtDate;
}
