package Classes;

import Exceptions.InvalidYearException;
import Exceptions.UnsupportedFuelTypeException;
import Interfaces.Flyable;

public class Airplane extends Vehicle implements Flyable
{
    private int altitude;
    private int maxSpeed;
    private int passengerCapacity;
    private String fuelType;
    private boolean hasWiFi;

    public Airplane(String brand, String model, int year, int altitude, int maxSpeed, int passengerCapacity, String fuelType, boolean hasWiFi) throws InvalidYearException {
        super(brand, model, year);
        this.altitude = altitude;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
        this.hasWiFi = hasWiFi;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    @Override
    public void start() {
        System.out.println("The airplane is taking off.");
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "Airplane{" +
                "altitude=" + altitude +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", hasWiFi=" + hasWiFi +
                '}';
    }

    // Interface implementation
    @Override
    public void takeOff() {
        System.out.println("The airplane is taking off.");
        this.altitude = 10000;
    }

    // Exception
    public void setFuelType(String fuelType) throws UnsupportedFuelTypeException {
        if (!fuelType.equalsIgnoreCase("Jet Fuel") && !fuelType.equalsIgnoreCase("Aviation Gasoline")) {
            throw new UnsupportedFuelTypeException("Unsupported fuel type: " + fuelType);
        }
        this.fuelType = fuelType;
    }

}
