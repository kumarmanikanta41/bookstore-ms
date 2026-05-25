package com.rmkk.catalog.service.repository;

import com.rmkk.catalog.service.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


}
