package com.nadiahamid.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadiahamid.cursomc.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
