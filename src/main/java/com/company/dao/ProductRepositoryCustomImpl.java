package com.company.dao;

import com.company.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Product> getAll() {
        Query query = em.createNativeQuery("SELECT * from product", Product.class);
        return query.getResultList();

    }

    @Override
    public List<Product> getAll(String name) {
        String jpql = "select u from Product u where 1=1";

        if (name != null && !name.trim().isEmpty()) {
            jpql += " and u.name=:name ";
        }

        Query query = em.createQuery(jpql, Product.class);

        if (name != null && !name.trim().isEmpty()) {
            query.setParameter("name", name);

        }

        return query.getResultList();
    }

    @Override
    public boolean updateProduct(Product u) {
        return false;
    }

    @Override
    public Product getById(int id) {
        Product u = em.find(Product.class, id);
        return u;
    }


    @Override
    public boolean removeProduct(int id) {
        Product product = em.find(Product.class, id);
        em.remove(product);
        return true;
    }

    @Override
    public boolean addProduct(Product p) {
        em.persist(p);
        return true;
    }
}


