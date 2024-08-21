package Classes;

import java.util.Objects;

public class Helicopter extends Vehicle
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

    // toString method
    @Override
    public String toString() {
        return super.toString() + " Helicopter [rotorSpeed=" + rotorSpeed + ", passengerCapacity=" + passengerCapacity +
                ", maxAltitude=" + maxAltitude + ", fuelType=" + fuelType + ", hasAutopilot=" + hasAutopilot + "]";
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rotorSpeed, passengerCapacity, maxAltitude, fuelType, hasAutopilot);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Helicopter helicopter = (Helicopter) obj;
        return rotorSpeed == helicopter.rotorSpeed &&
                passengerCapacity == helicopter.passengerCapacity &&
                maxAltitude == helicopter.maxAltitude &&
                hasAutopilot == helicopter.hasAutopilot &&
                Objects.equals(fuelType, helicopter.fuelType);
    }
}
