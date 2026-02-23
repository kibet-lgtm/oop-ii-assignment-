CT100/G/23925/24
VICTOR KIBET RANDABUN
kibetvictor630@gmail.com
kibet-lgtm

import java.util.Scanner;

// i) Base class Vehicle
class Vehicle {
    // Fields
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// ii) Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    // Additional field
    private String fuelType;

    // Constructor to initialize all fields (including those from Vehicle)
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call to parent class constructor
        this.fuelType = fuelType;
    }

    // Override displayDetails method to also print fuelType
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// iii) Class Showroom
public class Showroom {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.println("Enter Car Details:");

        System.out.print("Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object using user-provided data
        Car myCar = new Car(brand, model, year, fuelType);

        // Display the car's details
        System.out.println("\n--- Car Details ---");
        myCar.displayDetails();

        // Close the scanner
        scanner.close();
    }
}