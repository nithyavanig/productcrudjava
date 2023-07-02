package com.nithjava.service;

import com.nithjava.entity.Product;
import com.nithjava.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpln implements IProductservice{
    @Autowired
    ProductRepository prodRepo;

    @Override
    public Product getByProductId(String prodId) {
        return prodRepo.findById(prodId).get();
    }

    @Override
    public List<Product> getAllProduct() {
        return prodRepo.findAll();
    }

    @Override
    public String saveProduct(Product product) {
        prodRepo.save(product);
        return "Product id: "+ product.getId().toString();
    }

    @Override
    public String deleteProductById(String prodId) {
        if(prodRepo.existsById(prodId)){
            prodRepo.deleteById(prodId);
        }
        return "Product id: "+prodId;
    }
}
