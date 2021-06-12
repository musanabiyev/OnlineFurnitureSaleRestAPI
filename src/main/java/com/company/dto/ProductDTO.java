package com.company.dto;


import com.company.entity.Product;

public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private Integer categoryId;

    public ProductDTO() {
    }

    public ProductDTO(Product p) {
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
    }

    public ProductDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProductDTO(Integer id, String name, String description, Integer categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
