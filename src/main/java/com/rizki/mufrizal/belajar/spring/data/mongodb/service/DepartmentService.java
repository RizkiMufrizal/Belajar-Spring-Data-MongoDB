/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.service;

import com.rizki.mufrizal.belajar.spring.data.mongodb.domain.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author rizkimufrizal
 */
public interface DepartmentService {

    public Page<Department> getDepartments(Pageable pageable);
}
