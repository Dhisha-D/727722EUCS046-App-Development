package com.example.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Model.user;

public interface userRepo extends JpaRepository<user,Integer>{

}
