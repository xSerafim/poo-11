package com.jdbc.connection.View;

import com.jdbc.connection.Persistence.GenericDAO;

public class Main {
    public static void main(String[] args) {
        GenericDAO dao = new GenericDAO();

        try {
            dao.getConnection();
            System.out.println("Connection successful");
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}