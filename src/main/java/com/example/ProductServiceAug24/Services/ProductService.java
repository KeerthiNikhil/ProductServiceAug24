package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;

public interface ProductService {
    public Product getProductById(long id) throws ProductNotFoundException;

}
