package model;

import java.util.Objects;

public abstract class Vehicle
{
    // Attributes
    protected String brand;
    protected String model;
    protected int year;
    public static final int MAX_YEAR = 2024;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter y setter
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract method
    protected abstract void start();

    // Override methods from Object class
    // toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    // Hashcode method
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        // Verifica si el objeto actual es el mismo que el objeto comparado
        return (this == obj) ||
                // Verifica si el objeto comparado no es null y es de la misma clase
                (obj != null &&
                        getClass() == obj.getClass() &&
                        // Compara el año del objeto actual con el del objeto comparado
                        year == ((Vehicle) obj).year &&
                        // Compara la marca del objeto actual con la del objeto comparado
                        Objects.equals(brand, ((Vehicle) obj).brand) &&
                        // Compara el modelo del objeto actual con el del objeto comparado
                        Objects.equals(model, ((Vehicle) obj).model));
    }

    // Final method
    public final void printVehicleDetails()
    {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }


}
