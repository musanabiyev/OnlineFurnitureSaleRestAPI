package com.company.dao;

import com.company.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    public List<Product> getAll();

    public List<Product> getAll(String name);

    boolean updateProduct(Product p);

    public Product getById(int id);

    boolean removeProduct(int id);

    public boolean addProduct(Product p);
}
