package com.alpha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.pojo.Category;




public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
