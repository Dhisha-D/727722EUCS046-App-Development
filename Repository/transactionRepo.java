package com.example.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Model.transaction;

public interface transactionRepo extends JpaRepository<transaction,Integer>{

}
