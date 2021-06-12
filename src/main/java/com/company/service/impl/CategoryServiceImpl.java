package com.company.service.impl;


import com.company.dao.CategoryRepositoryCustom;
import com.company.entity.Category;
import com.company.service.inter.CategoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryServiceInter {

    @Autowired
    private CategoryRepositoryCustom categoryRepo;

    @Override
    public List<Category> getAll() {
        return categoryRepo.getAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepo.getById(id);
    }

    @Override
    public boolean updateCategory(Category c) {
        return categoryRepo.updateCategory(c);
    }

    @Override
    public boolean insertCategory(Category c) {
        return categoryRepo.insertCategory(c);
    }

    @Override
    public boolean removeCategory(int id) {
        return categoryRepo.removeCategory(id);
    }
}
