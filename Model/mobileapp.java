package com.example.backend.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class mobileapp {
    private String operator;
    private int id;
    private String planname;
    private int amount;
    private int  validitydays;
    
}
