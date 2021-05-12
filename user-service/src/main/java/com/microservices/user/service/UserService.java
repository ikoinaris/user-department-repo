package com.microservices.user.service;

import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;
import com.microservices.user.value_object.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getById(Long id) {
        return repository.findUserById(id);
    }

    public User saveUser(User user) {
        log.info("Inside saveUser method of service");
        return repository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        ResponseTemplate template = new ResponseTemplate();
        User user = repository.findUserById(userId);
    }
}
