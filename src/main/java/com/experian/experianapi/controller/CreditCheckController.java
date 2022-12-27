package com.experian.experianapi.controller;


import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCheckController {

    @Autowired
    private CreditCheckService creditCheckService;

    @GetMapping("/customerDetails")
    public CustomerDetails getCustomerDetails(@RequestBody CustomerDetails customerDetails) {
        return creditCheckService.getCustomerDetails(customerDetails);
    }
}
