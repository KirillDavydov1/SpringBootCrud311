package com.example.springbootcrud.service;

import com.example.springbootcrud.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    User getById(Long id);

    List<User> findAll();

    void save(User user);

    void deleteById(Long id);
}
