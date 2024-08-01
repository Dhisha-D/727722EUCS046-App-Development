package com.example.backend.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class user {
    private String email;
    private int pno;
    private String name;
    private int id;
  

}
