import java.util.Scanner;

class Vehicle {
    private String color;
    private String make;
    private String model;
    private int year;

    public Vehicle(String color, String make, String model, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        if(year>1850 && year<2025) {
            this.year = year;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}

class Dealership {

}

public class Main {
    public static void main(String[] args) {



    }
}