package com.experian.experianapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "card_details")
public class CardDetailsEntity implements Serializable {
    @Id
    protected int id;
    @Column
    protected String cardNumber;
    @Column
    protected LocalDate expDate;
    @Column
    protected int cvv;
    @Column
    protected String cardType;
}
