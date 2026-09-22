package com.codehex.blogapp.mappers;

import com.codehex.blogapp.domain.dtos.CategoryDto;
import com.codehex.blogapp.domain.dtos.CreateCategoryRequest;
import com.codehex.blogapp.domain.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDto toDto(Category category);

    Category toEntity(CreateCategoryRequest createCategoryRequest);

}
