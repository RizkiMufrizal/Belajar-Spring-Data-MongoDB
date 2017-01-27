/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.service.impl;

import com.rizki.mufrizal.belajar.spring.data.mongodb.domain.Category;
import com.rizki.mufrizal.belajar.spring.data.mongodb.repository.CategoryRepository;
import com.rizki.mufrizal.belajar.spring.data.mongodb.repository.DepartmentRepository;
import com.rizki.mufrizal.belajar.spring.data.mongodb.service.CategoryService;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author rizkimufrizal
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public TreeMap<String, Object> getCategories(Pageable pageable) {
        Page<Category> categories = categoryRepository.findAll(pageable);

        List<Category> categorys = new ArrayList<>();

        for (Category category : categories) {
            category.setDepartment(departmentRepository.findOne(category.getDepartmentId()));
            categorys.add(category);
        }

        TreeMap<String, Object> map = new TreeMap<>();
        map.put("content", categorys);
        map.put("last", categories.isLast());
        map.put("totalPages", categories.getTotalPages());
        map.put("totalElements", categories.getTotalElements());
        map.put("size", categories.getSize());
        map.put("number", categories.getNumber());
        map.put("sort", categories.getSort());
        map.put("first", categories.isFirst());
        map.put("numberOfElements", categories.getNumberOfElements());

        return map;
    }

}
