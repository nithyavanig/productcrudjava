package com.nithjava.controller;

import com.nithjava.entity.Product;
import com.nithjava.service.IProductservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    IProductservice productService;

    @PostMapping("/create/")
    public ResponseEntity<String> createProduct(@RequestBody Product product){
        return new ResponseEntity<String>(productService.saveProduct(product), HttpStatus.OK);
    }

    @GetMapping("/getAll/")
    public ResponseEntity<List<Product>> fetchAllProducts(){
        return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
    }


    public ResponseEntity<String> updateProduct(Product product){
        return new ResponseEntity<String>(productService.saveProduct(product), HttpStatus.OK);
    }

    @GetMapping("/fetchProductById/")
    public ResponseEntity<Product> getProductById(String prodId){
        return new ResponseEntity<>(productService.getByProductId(prodId),HttpStatus.OK);
    }
    @PostMapping("/delete/")
    public ResponseEntity<String> removeProduct(String prodId){
        return new ResponseEntity<>(productService.deleteProductById(prodId), HttpStatus.OK);
    }
}
