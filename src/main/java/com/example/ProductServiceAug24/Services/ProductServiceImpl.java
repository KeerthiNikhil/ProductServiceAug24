package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("dbImpl")
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product getProductById(long id) throws ProductNotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        }
        else{
            throw new ProductNotFoundException("Product with id"+id+" Not Found");
        }
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
