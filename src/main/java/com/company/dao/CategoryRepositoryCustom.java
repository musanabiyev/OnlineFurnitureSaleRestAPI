package com.company.dao;


import com.company.entity.Category;

import java.util.List;

public interface CategoryRepositoryCustom {

    public List<Category> getAll();

    public Category getById(int id);

    boolean updateCategory(Category c);

    boolean insertCategory(Category c);

    boolean removeCategory(int id);
}
