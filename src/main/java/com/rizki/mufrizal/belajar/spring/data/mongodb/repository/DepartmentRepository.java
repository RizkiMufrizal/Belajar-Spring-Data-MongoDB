/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.repository;

import com.rizki.mufrizal.belajar.spring.data.mongodb.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author rizkimufrizal
 */
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
