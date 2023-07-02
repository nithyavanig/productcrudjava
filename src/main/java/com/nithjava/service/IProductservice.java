package com.nithjava.service;

import com.nithjava.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductservice {
    Product getByProductId(String prodId);
    List<Product> getAllProduct();
    String saveProduct(Product product);
    String deleteProductById(String prodId);
}
