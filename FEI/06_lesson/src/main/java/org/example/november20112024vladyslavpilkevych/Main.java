package org.example.november20112024vladyslavpilkevych;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task to execute:");
        System.out.println("1. Work with Book records");
        System.out.println("2. Work with Headphones and Enums");
        System.out.println("3. Work with Student Database");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> workWithBooks(scanner);
            case 2 -> workWithHeadphones();
            case 3 -> workWithDatabase(scanner);
            default -> System.out.println("Invalid choice!");
        }
    }

    private static void workWithBooks(Scanner scanner) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("1984", "George Orwell", "Secker & Warburg", 1949, 5000000, 9.99));
        books.add(new Book("Brave New World", "Aldous Huxley", "Chatto & Windus", 1932, 3000000, 12.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, 1500000, 8.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 4000000, 10.99));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, 2000000, 7.99));

        System.out.print("Enter start year: ");
        int startYear = scanner.nextInt();
        System.out.print("Enter end year: ");
        int endYear = scanner.nextInt();

        System.out.println("Books published between " + startYear + " and " + endYear + ":");
        for (Book book : books) {
            if (book.publicationYear() >= startYear && book.publicationYear() <= endYear) {
                System.out.println(book);
            }
        }
    }

    private static void workWithHeadphones() {
        ArrayList<Headphones> headphonesList = new ArrayList<>();

        headphonesList.add(new Headphones("Sony WH-1000XM4", "Sony", "2023-01-01", 349.99, ProductStatus.AVAILABLE));
        headphonesList.add(new Headphones("AirPods Max", "Apple", "2022-12-15", 549.99, ProductStatus.DISCOUNTED));
        headphonesList.add(new Headphones("Bose QC45", "Bose", "2023-05-10", 329.99, ProductStatus.AVAILABLE));

        System.out.println("Before status update:");
        for (Headphones headphone : headphonesList) {
            headphone.displayDetails();
        }

        headphonesList.get(headphonesList.size() - 1).updateStatus(ProductStatus.UNAVAILABLE);

        System.out.println("\nAfter status update:");
        for (Headphones headphone : headphonesList) {
            headphone.displayDetails();
        }
    }

    private static void workWithDatabase(Scanner scanner) {
        StudentDatabase.createTable();

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
            StudentDatabase.insertStudent(name, surname, dob, email);
        }

        StudentDatabase.displayStudents();

        System.out.println("\nUpdating student with ID 4:");
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Surname: ");
        String surname = scanner.nextLine();
        System.out.print("New DOB: ");
        String dob = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        StudentDatabase.updateStudent(4, name, surname, dob, email);

        System.out.println("\nAfter update:");
        StudentDatabase.displayStudents();

        System.out.println("\nDeleting student with ID 4.");
        StudentDatabase.deleteStudent(4);

        System.out.println("\nAfter deletion:");
        StudentDatabase.displayStudents();
    }
}
