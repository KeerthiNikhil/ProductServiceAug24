package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.dtos.FakeStoreProductDto;
import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStore")
public class FakeStoreProductService implements ProductService{


    @Override
    public Product getProductById(long id) throws ProductNotFoundException {
        /*
        Take id from input and call this endpoint:a
        https://fakestoreapi.com/products/ +id
         */
        String url= "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate=new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto=restTemplate.getForObject(url, FakeStoreProductDto.class);
        if(fakeStoreProductDto==null){
            throw new ProductNotFoundException("Product with id"+" "+id+" "+"was not found");
        }
        return convertFakeStoreProductToProduct(fakeStoreProductDto);

    }

    @Override
    public Product createProduct(String name, String category, String description) {

        return null;
    }

    private Product convertFakeStoreProductToProduct(FakeStoreProductDto dto){
        Product product=new Product();
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        product.setName(dto.getTitle());
        return product;
      }

}
