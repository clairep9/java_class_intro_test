package org.example;

public class Car {
String make;
String model;
int year;
double price;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886) {
            this.year = 1886;
        } else {
            this.year = year;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double calculateDepreciation() {
        int yearsOld = 2025 - this.year;
        if (yearsOld <= 0) {
            return this.price;
        }
        return this.price * Math.pow(0.85, yearsOld);
    }

    // Print method
    public void print() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
