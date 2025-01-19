package org.example.november20112024vladyslavpilkevych;

public class Headphones {
    private String productName;
    private String brand;
    private String dateOfProduction;
    private double price;
    private ProductStatus currentStatus;

    public Headphones(String productName, String brand, String dateOfProduction, double price, ProductStatus currentStatus) {
        this.productName = productName;
        this.brand = brand;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
        this.currentStatus = currentStatus;
    }

    public void updateStatus(ProductStatus newStatus) {
        this.currentStatus = newStatus;
    }

    public void displayDetails() {
        System.out.println("Product: " + productName + ", Brand: " + brand + ", Date: " + dateOfProduction +
                ", Price: $" + price + ", Status: " + currentStatus);
    }
}
