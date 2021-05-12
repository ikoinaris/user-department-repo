package com.microservices.department.service;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("Inside of saveDepartment method of service");
        return repository.save(department);
    }

    public Department getById(Long id) {
        log.info("Inside findDepartment method of service");
        return repository.findDepartmentById(id);
    }
}
