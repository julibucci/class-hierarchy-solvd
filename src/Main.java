import model.Car;
import model.Motorcycle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating an instance of Car
        Car myCar = new Car("Toyota", "Corolla", 2020, 4, "Red", "Gasoline", true, 1.8);
        Car sportsCar = new Car("Ferrari", "488", 2021, 2, "Yellow", "Gasoline", false, 3.9);

        // Starting the cars, calls the method
        myCar.start();
        sportsCar.start();

        // Accelerating the cars
        myCar.accelerate();
        sportsCar.accelerate(200);

        // Using setters to modify car details
        myCar.setColor("Blue");
        myCar.setDoors(5);

        // Using getters to display car details
        System.out.println("My Car: " + myCar.getBrand() + " " + myCar.getModel() + ", Year: " + myCar.getYear() +
                ", Doors: " + myCar.getDoors() + ", Color: " + myCar.getColor() +
                ", Fuel Type: " + myCar.getFuelType() + ", Sunroof: " + myCar.isHasSunroof() +
                ", Engine Capacity: " + myCar.getEngineCapacity() + "L");

        System.out.println("Sports Car: " + sportsCar.getBrand() + " " + sportsCar.getModel() + ", Year: " + sportsCar.getYear() +
                ", Doors: " + sportsCar.getDoors() + ", Color: " + sportsCar.getColor() +
                ", Fuel Type: " + sportsCar.getFuelType() + ", Sunroof: " + sportsCar.isHasSunroof() +
                ", Engine Capacity: " + sportsCar.getEngineCapacity() + "L");

        // Creating instances of Motorcycle
        Motorcycle cruiser = new Motorcycle("Harley-Davidson", "Street 750", 2021, 749, "Cruiser", true, "Black", true);
        Motorcycle sportBike = new Motorcycle("Yamaha", "YZF-R1", 2022, 998, "Sport", false, "Blue", true);

        // Starting the motorcycles
        cruiser.start();
        sportBike.start();

        // Modifying attributes using setters
        cruiser.setColor("Red");
        cruiser.setHasWindshield(false);

        // Displaying updated details
        System.out.println("Updated Cruiser Motorcycle: " + cruiser.getBrand() + " " + cruiser.getModel() + ", Year: " + cruiser.getYear() +
                ", Engine Capacity: " + cruiser.getEngineCapacity() + "cc, Type: " + cruiser.getType() +
                ", Windshield: " + cruiser.isHasWindshield() + ", Color: " + cruiser.getColor() +
                ", ABS: " + cruiser.isHasABS());

        System.out.println("Updated Sport Bike: " + sportBike.getBrand() + " " + sportBike.getModel() + ", Year: " + sportBike.getYear() +
                ", Engine Capacity: " + sportBike.getEngineCapacity() + "cc, Type: " + sportBike.getType() +
                ", Windshield: " + sportBike.isHasWindshield() + ", Color: " + sportBike.getColor() +
                ", ABS: " + sportBike.isHasABS() + ", Seat Height: ");
    }
}

