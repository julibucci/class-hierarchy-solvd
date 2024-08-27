import Classes.*;
import Exceptions.InvalidYearException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Logger logger;
    public static void main(String[] args) {

        Vehicle airplane = null;
        Vehicle bus = null;
        VehicleFileManager fileManager = new VehicleFileManager();
        File log4j2File = new File("C:\\Users\\julie\\OneDrive\\Escritorio\\Exercises - Solvd\\class hierarchy- solvd\\src\\resources\\log4j2.properties");
        System.setProperty("log4j2.configurationFile",log4j2File.toURI().toString());

        logger = LogManager.getLogger(Main.class);

        try {
            airplane = new Airplane("Boeing", "747", 2025, 0, 900, 300, "Jet Fuel", true); // lo declaro asi para que me salte la excepcion
            //airplane = new Airplane("Boeing", "747", 2022, 0, 900, 300, "Jet Fuel", true);
            bus = new Bus("Mercedes", "Sprinter", 2020, 20, 2, true, 12, "Diesel");

            // Save details to file
            fileManager.saveVehicleDetails(airplane, "airplane_details.txt");
            fileManager.saveVehicleDetails(bus, "bus_details.txt");

            // Load details from file
            fileManager.loadVehicleDetails("airplane_details.txt");
            fileManager.loadVehicleDetails("bus_details.txt");

        } catch (InvalidYearException e) {
            logger.error("An error occurred while creating a vehicle: " + e.getMessage(), e);
            //System.out.println("An error occurred while creating a vehicle: " + e.getMessage());
        } catch (RuntimeException e) {
            logger.warn("A runtime error occurred: " + e.getMessage(), e);
            //System.out.println("A runtime error occurred: " + e.getMessage());
        } catch (Exception e) {
            logger.error("An unexpected error occurred: " + e.getMessage(), e);
            //System.out.println("An unexpected error occurred: " + e.getMessage());
        }


    }
}


