package com.experian.experianapi.entity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "customer")
public class CustomerDetailsEntity implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @OneToOne
    protected CardDetailsEntity cardDetailsEntity;
    @Column
    protected int creditScore;
    @Column
    protected String cardNumber;

}
