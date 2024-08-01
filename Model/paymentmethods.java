package com.example.backend.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class paymentmethods {
 private int id;
 private String methodname;
 private int userid;
 private int cvv;
 private int cardnumber;
 private Date expirydate;

}
