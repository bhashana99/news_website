package org.newswebsite.dao.interfaces;

import org.newswebsite.model.Category;

import java.util.List;

public interface ICategoryDAO {
    List<Category> getAllCategories();
}
