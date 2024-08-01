package com.example.backend.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class mobilenumber {
private int id;
private String operator;
private int number;
private int userid;


}
