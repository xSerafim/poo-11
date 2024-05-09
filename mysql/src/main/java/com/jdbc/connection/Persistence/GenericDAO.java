package com.jdbc.connection.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {
  private static final String URL = "jdbc:mysql://localhost:3306/employees";
  private static final String USER = "root";
  private static final String PASSWORD = "root";
  private Connection connection;

  public GenericDAO() {
    super();
  }

  public Connection getConnection() throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(URL, USER, PASSWORD);
    return connection;
  }
}