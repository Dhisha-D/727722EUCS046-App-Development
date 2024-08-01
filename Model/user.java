package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    private String email;
    private String name;
    private String ID;
    private int phone_no;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public int getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }
}
