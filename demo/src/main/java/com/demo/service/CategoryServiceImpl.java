package com.demo.service;

import com.demo.repo.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl {
    @Autowired
    ICategoryRepo categoryRepo;
}
