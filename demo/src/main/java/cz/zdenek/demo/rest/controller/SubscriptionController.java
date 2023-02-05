package cz.zdenek.demo.rest.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cz.zdenek.demo.rest.dto.QuotationDto;
import cz.zdenek.demo.rest.dto.SubscriptionDto;

/**
 * Endpoint for working with subscriptions.
 *
 * @author zdenekhak
 */
public class SubscriptionController {

    /**
     * Create subscription.
     */
    @PostMapping("/subscriptions")
    public void createSubscription(@Valid @RequestBody SubscriptionDto subscriptionDto) {

    }

    /**
     * Retrieving subscription.
     */
    @DeleteMapping("/subscriptions/{id}")
    public SubscriptionDto getSubscription(@PathVariable int id) {

        return null;
    }
}
