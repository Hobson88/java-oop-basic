package model;

import java.util.Arrays;

public class Car {
    String brand, model;
    double price;
    int year;
    int accessories[] = new int[10];

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", accessories=" + Arrays.toString(accessories) +
                '}';
    }

    public Car(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;

    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getAccessories() {
        return accessories;
    }

    public void setAccessories(int[] accessories) {
        this.accessories = accessories;
    }


}
