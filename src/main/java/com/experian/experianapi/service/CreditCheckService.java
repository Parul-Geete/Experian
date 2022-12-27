package com.experian.experianapi.service;

import com.experian.experianapi.dto.CardDetails;
import com.experian.experianapi.dto.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCheckService {
    public CustomerDetails getCustomerDetails(CustomerDetails customerDetails);

}
