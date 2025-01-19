package org.example.november20112024vladyslavpilkevych;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {
    private static final String DB_URL = "jdbc:sqlite:database_files/students.db";

    public static void createTable() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS student_info (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT, " +
                    "surname TEXT, " +
                    "date_of_birth TEXT, " +
                    "email TEXT)";
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudent(String name, String surname, String dob, String email) {
        String sql = "INSERT INTO student_info(name, surname, date_of_birth, email) VALUES(?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, surname);
            pstmt.setString(3, dob);
            pstmt.setString(4, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(int id, String name, String surname, String dob, String email) {
        String sql = "UPDATE student_info SET name = ?, surname = ?, date_of_birth = ?, email = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, surname);
            pstmt.setString(3, dob);
            pstmt.setString(4, email);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        String sql = "DELETE FROM student_info WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayStudents() {
        String sql = "SELECT * FROM student_info";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
                        ", Surname: " + rs.getString("surname") +
                        ", DOB: " + rs.getString("date_of_birth") +
                        ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        createTable();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter student " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dob = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            insertStudent(name, surname, dob, email);
        }

        displayStudents();

        System.out.println("\nUpdating student with ID 4:");
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Surname: ");
        String surname = scanner.nextLine();
        System.out.print("New DOB: ");
        String dob = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        updateStudent(4, name, surname, dob, email);

        System.out.println("\nAfter update:");
        displayStudents();

        System.out.println("\nDeleting student with ID 4.");
        deleteStudent(4);

        System.out.println("\nAfter deletion:");
        displayStudents();
    }
}
