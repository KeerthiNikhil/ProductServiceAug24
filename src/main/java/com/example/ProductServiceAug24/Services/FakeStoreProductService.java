package com.example.ProductServiceAug24.Services;

import com.example.ProductServiceAug24.Models.Product;
import com.example.ProductServiceAug24.dtos.FakeStoreProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(long id) {
        /*
        Take id from input and call this endpoint:a
        https://fakestoreapi.com/products/ +id
         */
        String url= "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate=new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto=restTemplate.getForObject(url, FakeStoreProductDto.class);
        return convertFakeStoreProductToProduct(fakeStoreProductDto);

    }
      private Product convertFakeStoreProductToProduct(FakeStoreProductDto dto){
        Product product=new Product();
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        product.setName(dto.getTitle());
        return product;
      }

}
