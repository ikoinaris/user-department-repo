package com.microservices.user.service;

import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;
import com.microservices.user.value_object.Department;
import com.microservices.user.value_object.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    private static String url = "http://DEPARTMENT-SERVICE/departments/";

    public User saveUser(User user) {
        log.info("Inside saveUser method of service");
        return repository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of service");
        ResponseTemplate template = new ResponseTemplate();
        User user = repository.findUserById(userId);

        Department department = restTemplate.getForObject(url + user.getDepartmentId(), Department.class);

        template.setUser(user);
        template.setDepartment(department);

        return template;
    }
}
