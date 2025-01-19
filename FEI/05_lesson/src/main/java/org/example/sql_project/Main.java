package org.example.sql_project;

import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dbDirectory = "database_files/";
        String dbName = "books.db";
        String full = dbDirectory + dbName;
        String fulldbPath = "jdbc:sqlite:" + full;

        try (Connection connection = DriverManager.getConnection(fulldbPath)) {
            if (connection != null) {
                System.out.println("Connected to database");

                String createSQLTable = "CREATE TABLE IF NOT EXISTS book_details (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "name VARCHAR(100) NOT NULL, " +
                        "authors VARCHAR(100) NOT NULL, " +
                        "publication_year VARCHAR(100) NOT NULL, " +
                        "copies_sold INTEGER NOT NULL, " +
                        "book_type VARCHAR(100) NOT NULL)";

                try (Statement statement = connection.createStatement()) {
                    statement.execute(createSQLTable);
                } catch (SQLException e) {
                    System.out.println("Error creating table: " + e.getMessage());
                }

            } else {
                System.out.println("Had problems with connection");
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student surname: ");
        String authors = sc.nextLine();
        System.out.print("Enter student date of birth (YYYY-MM-DD): ");
        String publication_year = sc.nextLine();
        System.out.print("Enter student email: ");
        String copies_sold = sc.nextLine();
        System.out.print("Enter student registration date: ");
        String book_type = sc.nextLine();

        String insertSQLStatement = "INSERT INTO book_details (name, authors, publication_year, copies_sold, book_type) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(fulldbPath)) {
            try (PreparedStatement statement = connection.prepareStatement(insertSQLStatement)) {
                statement.setString(1, name);
                statement.setString(2, authors);
                statement.setString(3, publication_year);
                statement.setString(4, copies_sold);
                statement.setString(5, book_type);
                statement.executeUpdate();  // Execute the insertion
                System.out.println("Student data has been inserted successfully!");
            } catch (SQLException e) {
                System.out.println("Error inserting data: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}