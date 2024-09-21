package com.example.ProductServiceAug24.repositories;

import com.example.ProductServiceAug24.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //Select * from Products where name={name} and category={category};
    Product findFirstByNameAndCategory(String name,String category);

    //find all products
    //Select * from Products;
    List<Product> findAll();

    //Select * from Products where id={id};
//    Product findById(long id);

    //Select * from Products where category={category};
    List<Product> findAllByCategory(String category);

    Optional<Product>  findById(long id);
    List<Product> findAllByNameLike(String word);
    List<Product> findAllByNameLikeIgnoreCase(String word);
    List<Product> findAllByIdLessThan(Long id);
    @Query("select p from Product p where p.id=:id")
    Product selectById(long id);

    @Query(value = "select * from product p where p.id=:id",nativeQuery = true)
    Product selectByProductId(long id);

}
