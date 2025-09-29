package org.newswebsite;

import util.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        try (Connection conn = DbConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Connected to DB!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}