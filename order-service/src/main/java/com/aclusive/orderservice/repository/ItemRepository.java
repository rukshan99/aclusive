package com.aclusive.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aclusive.orderservice.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}