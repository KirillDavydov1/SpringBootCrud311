package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


}
