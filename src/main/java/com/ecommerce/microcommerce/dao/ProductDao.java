package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

/**
 * Created by Christian on 08/04/2018.
 */
public interface ProductDao {
    public List<Product> findAll();
    public ProductfindById<>(int id);
    public Productsave<>(Product product);

}
