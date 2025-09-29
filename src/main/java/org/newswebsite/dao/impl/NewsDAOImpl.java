package org.newswebsite.dao.impl;

import org.newswebsite.dao.interfaces.INewsDAO;
import org.newswebsite.model.News;
import util.DbConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDAOImpl implements INewsDAO {
    @Override
    public List<News> getNewsByCategoryId(int categoryId) {
        List<News> newsList = new ArrayList<>();
        String sql = "SELECT n.id, n.title, n.content " +
                "FROM News n " +
                "JOIN News_Category nc ON n.id = nc.news_id " +
                "WHERE nc.category_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setTitle(rs.getString("title"));
                news.setContent(rs.getString("content"));
                newsList.add(news);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return newsList;
    }
}
