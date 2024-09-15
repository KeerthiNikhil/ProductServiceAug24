package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dbImpl")
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product getProductById(long id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public Product createProduct(String name, String category, String description) {
        Product p=productRepository.findFirstByNameAndCategory(name,category);
        if(p!=null){
            return p;
        }
        Product product=new Product();
        product.setCategory(category);
        product.setDescription(description);
        product.setName(name);
        product=productRepository.save(product);
        System.out.println(product.getId());
        return product;
    }
}
