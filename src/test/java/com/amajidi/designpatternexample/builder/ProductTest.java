package com.amajidi.designpatternexample.builder;

import org.junit.jupiter.api.Test;

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
