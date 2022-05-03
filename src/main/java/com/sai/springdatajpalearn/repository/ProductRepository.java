package com.sai.springdatajpalearn.repository;

import com.sai.springdatajpalearn.entity.Product;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
