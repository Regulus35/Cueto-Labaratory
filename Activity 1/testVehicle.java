import java.util.Scanner;
 
public class TestVehicle {

    static class Vehicle {
        private String brand;
        private int speed;
        private String fuelType;
 
        public Vehicle(String brand, int speed, String fuelType) {
            this.brand = brand;
            this.speed = speed; 
            this.fuelType = fuelType;
        }
 
        public String getBrand() {
            return brand;
        }
 
        public int getSpeed() {
            return speed;
        }
 
        public String getFuelType() {
            return fuelType;
        }
 
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }
    }
   
   
    static class Car extends Vehicle {
        private int numberOfDoors;
 
        public Car(String brand, int speed, String fuelType, int numberOfDoors) {
            super(brand, speed, fuelType);
            this.numberOfDoors = numberOfDoors;
        }
 
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }
 
    
    static class Motorcycle extends Vehicle {
        private boolean hasSidecar;
 
        public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
            super(brand, speed, fuelType);
            this.hasSidecar = hasSidecar;
        }
 
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of vehicle to enter details for:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
 
        if (choice == 1) {
            
            System.out.println("Enter Car details:");
            System.out.print("Brand: ");
            String carBrand = scanner.nextLine();
            System.out.print("Speed: ");
            int carSpeed = scanner.nextInt();
            System.out.print("Fuel Type: ");
            String carFuelType = scanner.next();
            System.out.print("Number of Doors: ");
            int carNumberOfDoors = scanner.nextInt();
            Car car = new Car(carBrand, carSpeed, carFuelType, carNumberOfDoors);
            System.out.println("\nCar Details:");
            car.displayInfo();
        } else if (choice == 2) {
           
            System.out.println("Enter Motorcycle details:");
            System.out.print("Brand: ");
            String motorcycleBrand = scanner.nextLine();
            System.out.print("Speed: ");
            int motorcycleSpeed = scanner.nextInt();
            System.out.print("Fuel Type: ");
            String motorcycleFuelType = scanner.next();
            System.out.print("Has Sidecar (true/false): ");
            boolean hasSidecar = scanner.nextBoolean();
            Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
            System.out.println("\nMotorcycle Details:");
            motorcycle.displayInfo();
        } else {
            System.out.println("Invalid , Please select either 1 or 2.");
        }
 
        scanner.close();
        System.out.println();
        System.out.println("End of Program.");
    }
}