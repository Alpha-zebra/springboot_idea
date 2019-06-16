package com.alpha.mapper;

import com.alpha.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("select * from category_")
    List<Category> findAll();
}
