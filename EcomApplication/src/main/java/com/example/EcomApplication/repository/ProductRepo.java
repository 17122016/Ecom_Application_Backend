package com.example.EcomApplication.repository;

import com.example.EcomApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query(
            "SELECT p fROM Product p WHERE " +
            "LOWER(p.name) LIKE CONCAT('%',:keyword,'%') OR " +
            "LOWER(p.brand) LIKE CONCAT('%',:keyword,'%') OR " +
            "LOWER(p.description) LIKE CONCAT('%',:keyword,'%') OR "  +
            "LOWER(p.category) LIKE CONCAT('%',:keyword,'%')"
    )
    List<Product> searchProducts(@Param("keyword") String keyword);
}
