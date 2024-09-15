package com.example.ProductServiceAug24.repositories;

import com.example.ProductServiceAug24.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //Select * from Products where name={name} and category={category};
    Product findFirstByNameAndCategory(String name,String category);

    //find all products
    //Select * from Products;
    List<Product> findAll();

    //Select * from Products where id={id};
    Product findById(long id);

    //Select * from Products where category={category};
    List<Product> findAllByCategory(String category);
}
