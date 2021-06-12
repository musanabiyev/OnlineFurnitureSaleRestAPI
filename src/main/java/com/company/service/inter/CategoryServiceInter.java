package com.company.service.inter;


import com.company.entity.Category;

import java.util.List;

public interface CategoryServiceInter {

    public List<Category> getAll();

    public Category getById(int id);

    boolean updateCategory(Category c);

    boolean insertCategory(Category c);

    boolean removeCategory(int id);
}
