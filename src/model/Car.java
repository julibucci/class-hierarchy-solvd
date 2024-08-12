package model;

public class Car extends Vehicle
{
    // Attributes
    private int doors;

    // Constructor
    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    // Getter y setter
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Start method override
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Accelerate Method-overloading
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("The car is accelerating to " + speed + " km/h.");
    }
}
