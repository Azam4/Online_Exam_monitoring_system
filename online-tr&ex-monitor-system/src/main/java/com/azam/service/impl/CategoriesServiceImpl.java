package com.azam.service.impl;


import java.util.List;

import com.azam.model.Categories;

public interface CategoriesServiceImpl {

    List<Categories> findAll();

    void addCategories(Categories categories);

    void deleteCategories(Categories categories);

    Categories findByCategoryName(String category_name);



}
