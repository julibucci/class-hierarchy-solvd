import model.*;

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


        // Creating instances of Truck
        Truck deliveryTruck = new Truck("Mercedes-Benz", "Actros", 2019, 18000, 4, true, "Diesel", 2);
        Truck pickupTruck = new Truck("Ford", "F-150", 2022, 1000, 2, false, "Gasoline", 5);

        // Using getters to display truck details
        System.out.println("Delivery Truck: " + deliveryTruck.getBrand() + " " + deliveryTruck.getModel() +
                ", Year: " + deliveryTruck.getYear() +
                ", Load Capacity: " + deliveryTruck.getLoadCapacity() + " kg" +
                ", Number of Axles: " + deliveryTruck.getNumberOfAxles() +
                ", Has Trailer: " + deliveryTruck.isHasTrailer() +
                ", Fuel Type: " + deliveryTruck.getFuelType() +
                ", Cabin Size: " + deliveryTruck.getCabinSize() + " seats");

        System.out.println("Pickup Truck: " + pickupTruck.getBrand() + " " + pickupTruck.getModel() +
                ", Year: " + pickupTruck.getYear() +
                ", Load Capacity: " + pickupTruck.getLoadCapacity() + " kg" +
                ", Number of Axles: " + pickupTruck.getNumberOfAxles() +
                ", Has Trailer: " + pickupTruck.isHasTrailer() +
                ", Fuel Type: " + pickupTruck.getFuelType() +
                ", Cabin Size: " + pickupTruck.getCabinSize() + " seats");

        // Starting the trucks
        deliveryTruck.start();
        pickupTruck.start();

        // Modifying attributes using setters
        deliveryTruck.setLoadCapacity(20000);
        deliveryTruck.setHasTrailer(false);
        pickupTruck.setFuelType("Electric");

        // Displaying updated details
        System.out.println("Updated Delivery Truck: " + deliveryTruck.getBrand() + " " + deliveryTruck.getModel() +
                ", Year: " + deliveryTruck.getYear() +
                ", Load Capacity: " + deliveryTruck.getLoadCapacity() + " kg" +
                ", Number of Axles: " + deliveryTruck.getNumberOfAxles() +
                ", Has Trailer: " + deliveryTruck.isHasTrailer() +
                ", Fuel Type: " + deliveryTruck.getFuelType() +
                ", Cabin Size: " + deliveryTruck.getCabinSize() + " seats");

        System.out.println("Updated Pickup Truck: " + pickupTruck.getBrand() + " " + pickupTruck.getModel() +
                ", Year: " + pickupTruck.getYear() +
                ", Load Capacity: " + pickupTruck.getLoadCapacity() + " kg" +
                ", Number of Axles: " + pickupTruck.getNumberOfAxles() +
                ", Has Trailer: " + pickupTruck.isHasTrailer() +
                ", Fuel Type: " + pickupTruck.getFuelType() +
                ", Cabin Size: " + pickupTruck.getCabinSize() + " seats");

        // Creating instances of Helicopter
        Helicopter privateHelicopter = new Helicopter("Bell", "429", 2023, 320, 6, 20000, "Jet Fuel", true);
        Helicopter commercialHelicopter = new Helicopter("Airbus", "H145", 2022, 280, 10, 18000, "Jet Fuel", false);

        // Starting the helicopters
        privateHelicopter.start();  // Output: The helicopter is starting.
        commercialHelicopter.start();  // Output: The helicopter is starting.

        // Modifying attributes using setters
        privateHelicopter.setMaxAltitude(21000);
        privateHelicopter.setFuelType("Electric");
        commercialHelicopter.setPassengerCapacity(12);
        commercialHelicopter.setHasAutopilot(true);

        // Creating instances of Bus with the specified attributes
        Bus cityBus = new Bus("Volvo", "B8R", 2021, 40, 2, true, 12, "Diesel");
        Bus schoolBus = new Bus("Blue Bird", "All American", 2022, 60, 3, true, 14, "CNG");

        // Using getters to display bus details
        System.out.println("City Bus: " + cityBus.getBrand() + " " + cityBus.getModel() +
                ", Year: " + cityBus.getYear() +
                ", Seating Capacity: " + cityBus.getSeatingCapacity() +
                ", Number of Doors: " + cityBus.getNumberOfDoors() +
                ", Air Conditioning: " + (cityBus.isHasAirConditioning() ? "Yes" : "No") +
                ", Length: " + cityBus.getLength() + " meters" +
                ", Fuel Type: " + cityBus.getFuelType());

        System.out.println("School Bus: " + schoolBus.getBrand() + " " + schoolBus.getModel() +
                ", Year: " + schoolBus.getYear() +
                ", Seating Capacity: " + schoolBus.getSeatingCapacity() +
                ", Number of Doors: " + schoolBus.getNumberOfDoors() +
                ", Air Conditioning: " + (schoolBus.isHasAirConditioning() ? "Yes" : "No") +
                ", Length: " + schoolBus.getLength() + " meters" +
                ", Fuel Type: " + schoolBus.getFuelType());

        // Starting the buses
        cityBus.start();  // Output: The bus is starting.
        schoolBus.start();  // Output: The bus is starting.

        // Modifying attributes using setters
        cityBus.setLength(13);
        cityBus.setFuelType("Electric");
        schoolBus.setSeatingCapacity(65);
        schoolBus.setHasAirConditioning(false);



    }
    }

