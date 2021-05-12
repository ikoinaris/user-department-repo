package com.microservices.user.service;

import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getById(Long id) {
        return repository.findUserById(id);
    }
}
