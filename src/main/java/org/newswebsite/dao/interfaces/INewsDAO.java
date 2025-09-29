package org.newswebsite.dao.interfaces;

import org.newswebsite.model.News;

import java.util.List;

public interface INewsDAO {
    List<News> getNewsByCategoryId(int categoryId);
}
