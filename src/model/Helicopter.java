package model;

public class Helicopter
{
    private int rotorSpeed;
    private int passengerCapacity;
    private int maxAltitude;
    private String fuelType; //Jet Fuel, Electric
    private boolean hasAutopilot;

    public Helicopter(String brand, String model, int year, int rotorSpeed, int passengerCapacity, int maxAltitude, String fuelType, boolean hasAutopilot) {
        super(brand, model, year);
        this.rotorSpeed = rotorSpeed;
        this.passengerCapacity = passengerCapacity;
        this.maxAltitude = maxAltitude;
        this.fuelType = fuelType;
        this.hasAutopilot = hasAutopilot;
    }

    public int getRotorSpeed() {
        return rotorSpeed;
    }

    public void setRotorSpeed(int rotorSpeed) {
        this.rotorSpeed = rotorSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }

    @Override
    public void start() {
        System.out.println("The helicopter is starting.");
    }
}
