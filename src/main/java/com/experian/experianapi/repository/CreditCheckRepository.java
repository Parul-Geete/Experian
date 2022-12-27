package com.experian.experianapi.repository;

import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.entity.CustomerDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends JpaRepository<CustomerDetailsEntity, String> {

    CustomerDetailsEntity getCustomerDetailsEntitiesByCardNumber(String cardNo);

}
