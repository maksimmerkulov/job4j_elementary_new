package ru.job4j.calculator;

/**
 * A program that calculates ideal storage temperatures for fruits and meat.
 *
 * <p>Example output:</p>
 * <pre>{@code
 * Ideal temperature for fruits is 8.0°C
 * Ideal temperature for meat is 5.0°C
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TemperatureFit {

    /**
     * Returns the ideal storage temperature for fruits.
     *
     * @param temperature the current temperature
     * @return the ideal storage temperature for fruits
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Returns the ideal storage temperature for meat.
     *
     * @param temperature the current temperature
     * @return the ideal storage temperature for meat
     */
    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    /**
     * Starts the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = idealTemperatureForFruits(temperature);
        double meatTemp = idealTemperatureForMeat(temperature);
        System.out.println(
                "Ideal temperature for fruits is " + fruitsTemp + "°C"
        );
        System.out.println(
                "Ideal temperature for meat is " + meatTemp + "°C"
        );
    }
}
