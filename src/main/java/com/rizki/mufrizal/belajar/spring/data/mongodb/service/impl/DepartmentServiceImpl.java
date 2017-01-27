/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.service.impl;

import com.rizki.mufrizal.belajar.spring.data.mongodb.domain.Department;
import com.rizki.mufrizal.belajar.spring.data.mongodb.repository.DepartmentRepository;
import com.rizki.mufrizal.belajar.spring.data.mongodb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author rizkimufrizal
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Page<Department> getDepartments(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

}
