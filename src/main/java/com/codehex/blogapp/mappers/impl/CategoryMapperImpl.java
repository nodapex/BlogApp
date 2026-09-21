package com.codehex.blogapp.mappers.impl;

import com.codehex.blogapp.domain.dtos.CategoryDto;
import com.codehex.blogapp.domain.dtos.CreateCategoryRequest;
import com.codehex.blogapp.domain.entities.Category;
import com.codehex.blogapp.mappers.CategoryMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper {

  @Override
  public CategoryDto toDto(Category category) {
    return CategoryDto.builder()
        .name(category.getName())
        // all values
        .build();
  }

  @Override
  public Category toEntity(CreateCategoryRequest createCategoryRequest) {
    return null;
  }
}
