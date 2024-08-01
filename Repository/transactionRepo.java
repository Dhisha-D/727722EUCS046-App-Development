package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.transaction;

public interface transactionRepo extends JpaRepository<transaction,Integer>{

}
