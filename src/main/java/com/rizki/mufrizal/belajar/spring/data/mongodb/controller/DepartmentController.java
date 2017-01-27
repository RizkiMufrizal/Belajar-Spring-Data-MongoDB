/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.controller;

import com.rizki.mufrizal.belajar.spring.data.mongodb.domain.Department;
import com.rizki.mufrizal.belajar.spring.data.mongodb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rizkimufrizal
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/api/department")
    public Page<Department> getDepartments(Pageable pageable) {
        return departmentService.getDepartments(pageable);
    }

}
