package com.learn.springweb.entities.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springweb.entities.Product;

public interface ProductRepositry extends JpaRepository<Product, Integer> {

}
