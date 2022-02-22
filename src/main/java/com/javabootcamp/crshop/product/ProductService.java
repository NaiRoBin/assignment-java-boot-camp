package com.javabootcamp.crshop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product findProductByName(String name){
        Optional<Product> result = productRepository.findByName(name);
        if(result.isPresent()) {
            return result.get();
        }
        throw new ProductNotFoundException(name);
    }

    public List<Product> findProductAll(){
        List<Product> result = productRepository.findAll();
        if(result.isEmpty()){
            throw new ProductNotFoundException("");
        }
        return result;

    }


}
