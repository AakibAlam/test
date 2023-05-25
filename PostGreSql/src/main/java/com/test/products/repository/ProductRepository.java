package com.test.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.products.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
