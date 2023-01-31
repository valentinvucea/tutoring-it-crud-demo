package com.testingit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testingit.demo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
