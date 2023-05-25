package com.test.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.products.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}