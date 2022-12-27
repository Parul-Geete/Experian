package com.experian.experianapi.service.impl;

import com.experian.experianapi.dto.CardDetails;
import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.entity.CustomerDetailsEntity;
import com.experian.experianapi.repository.CreditCheckRepository;
import com.experian.experianapi.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckIMPL implements CreditCheckService {

    @Autowired
    private CreditCheckRepository creditCheckRepository;

    @Override
    public CustomerDetails getCustomerDetails(CustomerDetails customerDetails) {

        CustomerDetailsEntity custDetails = creditCheckRepository.getCustomerDetailsEntitiesByCardNumber(customerDetails.getCardNumber());
        customerDetails.setCreditScore(custDetails.getCreditScore());
        return customerDetails;
    }
}
