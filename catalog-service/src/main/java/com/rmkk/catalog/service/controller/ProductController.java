package com.rmkk.catalog.service.controller;

import com.rmkk.catalog.service.domain.ProductEntity;
import com.rmkk.catalog.service.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductEntity> getProducts(int page) {
        return productService.getProducts(page);
    }
}
