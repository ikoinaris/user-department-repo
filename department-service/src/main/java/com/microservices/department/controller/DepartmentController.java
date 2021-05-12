package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of controller");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable  Long id) {
        log.info("Inside findDepartment method of controller");
        return service.getById(id);
    }
}
