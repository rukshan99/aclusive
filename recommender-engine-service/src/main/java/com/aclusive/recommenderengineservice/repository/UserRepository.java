package com.aclusive.recommenderengineservice.repository;

import com.aclusive.recommenderengineservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
