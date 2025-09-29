package org.newswebsite.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.newswebsite.dao.interfaces.INewsDAO;
import org.newswebsite.model.News;

import java.io.IOException;
import java.util.List;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    private final INewsDAO newsDAO;

    public NewsServlet(INewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String categoryIdParam = request.getParameter("categoryId");
        if (categoryIdParam != null) {
            int categoryId = Integer.parseInt(categoryIdParam);
            List<News> newsList = newsDAO.getNewsByCategoryId(categoryId);
            request.setAttribute("newsList", newsList);
            request.getRequestDispatcher("/news.jsp").forward(request, response);
        } else {
            response.getWriter().println("Category ID is missing!");
        }
    }
}
