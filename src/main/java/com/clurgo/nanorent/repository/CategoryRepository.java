package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
