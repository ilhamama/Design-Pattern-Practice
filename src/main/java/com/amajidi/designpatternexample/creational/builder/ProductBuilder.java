package com.amajidi.designpatternexample.creational.builder;

public class ProductBuilder {    
    private String id;
    private String name;
    private Long price;
    private ProductCategory category;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }
    public ProductBuilder setCategory(ProductCategory category) {
        this.category = category;
        return this;
    }

    public Product build() {
        return new Product(id, name, price, category);
    }
}
