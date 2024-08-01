package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class mobileno {
@Id
private int id;
private int user_id;
private int number;
private String operator;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getUser_id() {
    return user_id;
}
public void setUser_id(int user_id) {
    this.user_id = user_id;
}
public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
}
public String getOperator() {
    return operator;
}
public void setOperator(String operator) {
    this.operator = operator;
}

}
