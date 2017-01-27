/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.mufrizal.belajar.spring.data.mongodb.service;

import java.util.TreeMap;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author rizkimufrizal
 */
public interface CategoryService {

    public TreeMap<String, Object> getCategories(Pageable pageable);
}
