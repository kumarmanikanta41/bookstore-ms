package com.rmkk.catalog.service.service;

import com.rmkk.catalog.service.ApplicationProperties;
import com.rmkk.catalog.service.domain.ProductEntity;
import com.rmkk.catalog.service.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepository;

    private ApplicationProperties applicationProperties;

    public ProductService(ProductRepository productRepository, ApplicationProperties applicationProperties) {
        this.productRepository = productRepository;
        this.applicationProperties = applicationProperties;
    }

    public Page<ProductEntity> getProducts(int page) {
        Pageable pageable = PageRequest.of(page, applicationProperties.pageSize(), Sort.by("name").ascending());
        return productRepository.findAll(pageable);
    }
}
