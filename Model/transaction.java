package com.example.backend.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class transaction {
private int id;
private int userid;
private String state;
private int mobilenumberid;
private int planid;
private Date transactiondate;
}
