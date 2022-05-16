package com.aclusive.recommenderengineservice.repository;

import com.aclusive.recommenderengineservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
