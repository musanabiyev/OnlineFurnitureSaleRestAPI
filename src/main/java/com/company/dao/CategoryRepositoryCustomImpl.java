package com.company.dao;

import com.company.entity.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CategoryRepositoryCustomImpl implements CategoryRepositoryCustom {


    @PersistenceContext
    EntityManager em;

    @Override
    public List<Category> getAll() {
        Query query = em.createNativeQuery("SELECT * FROM category", Category.class);
        return query.getResultList();
    }

    @Override
    public Category getById(int id) {
        Category c = em.find(Category.class,
                id);
        return c;
    }

    @Override
    public boolean updateCategory(Category c) {
        em.merge(c);
        return true;
    }

    @Override
    public boolean insertCategory(Category c) {
        em.persist(c);
        return true;
    }

    @Override
    public boolean removeCategory(int id) {
        Category c = em.find(Category.class,
                id);
        em.remove(c);
        return true;
    }
}
