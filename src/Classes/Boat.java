package Classes;

public class Boat extends Vehicle
{
    private int maxSpeed; // in km/h
    private int length; // in meters
    private int passengerCapacity;
    private String fuelType; // e.g., Diesel, Gasoline
    private boolean hasNavigationSystem;

    public Boat(String brand, String model, int year, int maxSpeed, int length, int passengerCapacity, String fuelType, boolean hasNavigationSystem) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
        this.hasNavigationSystem = hasNavigationSystem;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasNavigationSystem() {
        return hasNavigationSystem;
    }

    public void setHasNavigationSystem(boolean hasNavigationSystem) {
        this.hasNavigationSystem = hasNavigationSystem;
    }

    @Override
    public void start() {
        System.out.println("The boat is starting.");
    }
}
