package com.amajidi.designpatternexample.creational.builder;

import org.junit.jupiter.api.Test;

import com.amajidi.designpatternexample.creational.builder.Product;
import com.amajidi.designpatternexample.creational.builder.ProductBuilder;
import com.amajidi.designpatternexample.creational.builder.ProductCategory;

public class ProductTest {

    @Test
    public void testBuilder() {
        Product product = new ProductBuilder()
                .setId("id_1")
                .setName("Bread")
                .setPrice(6000L)
                .setCategory(ProductCategory.FOOD)
                .build();

        System.out.println(product);
    }
}
