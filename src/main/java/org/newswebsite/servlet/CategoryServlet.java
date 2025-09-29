package org.newswebsite.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.newswebsite.dao.impl.CategoryDAOImpl;
import org.newswebsite.dao.interfaces.ICategoryDAO;
import org.newswebsite.model.Category;

import java.io.IOException;
import java.util.List;


@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {

private final ICategoryDAO categoryDAO;

    public CategoryServlet() {
        this.categoryDAO = new CategoryDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Category> categories = categoryDAO.getAllCategories();
            System.out.println(categories);
            request.setAttribute("categories", categories);
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
