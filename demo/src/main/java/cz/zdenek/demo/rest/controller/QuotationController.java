package cz.zdenek.demo.rest.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cz.zdenek.demo.rest.dto.QuotationDto;
import lombok.RequiredArgsConstructor;

/**
 * Endpoint for working with quotations.
 *
 * @author zdenekhak
 */
@RestController
@RequiredArgsConstructor
public class QuotationController {

    /**
     * Create quotation.
     */
    @PostMapping("/quotations")
    public void createQuotation(@Valid @RequestBody QuotationDto quotationDto) {

    }
}
