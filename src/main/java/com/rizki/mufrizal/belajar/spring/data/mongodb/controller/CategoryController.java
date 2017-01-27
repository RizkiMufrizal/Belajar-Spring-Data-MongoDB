/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.controller;

import com.rizki.mufrizal.belajar.spring.data.mongodb.service.CategoryService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rizkimufrizal
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/api/category")
    public Map<String, Object> getCategories(Pageable pageable) {
        return categoryService.getCategories(pageable);
    }

}
