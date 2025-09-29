package org.newswebsite.model;

import java.util.List;

public class News {
    private int id;
    private String title;
    private String content;
    private List<Category> categories;

    public News(int id, List<Category> categories, String content, String title) {
        this.id = id;
        this.categories = categories;
        this.content = content;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
