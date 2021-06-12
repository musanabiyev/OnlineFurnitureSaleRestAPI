package com.company.service.impl;


import com.company.dao.ProductRepositoryCustom;
import com.company.entity.Product;
import com.company.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductServiceInter {

    @Autowired
    private ProductRepositoryCustom productRepo;

    @Override
    public List<Product> getAll() {
        return productRepo.getAll();
    }

    @Override
    public List<Product> getAll(String name) {
        return productRepo.getAll(name);
    }

    @Override
    public boolean updateProduct(Product p) {
        return productRepo.updateProduct(p);
    }

    @Override
    public Product getById(int id) {
        return productRepo.getById(id);
    }

    @Override
    public boolean removeProduct(int id) {
        return productRepo.removeProduct(id);
    }

    @Override
    public boolean addProduct(Product p) {
        return productRepo.addProduct(p);
    }
}
