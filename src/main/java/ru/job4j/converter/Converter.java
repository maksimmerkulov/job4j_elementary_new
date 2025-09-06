package ru.job4j.converter;

/**
 * A utility class for converting Russian rubles into other currencies.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Converter {

    /**
     * Returns the equivalent amount in euros.
     *
     * @param value the amount in rubles
     * @return the equivalent amount in euros
     */
    public static double rubleToEuro(double value) {
        return value / 90;
    }

    /**
     * Returns the equivalent amount in US dollars.
     *
     * @param value the amount in rubles
     * @return the equivalent amount in US dollars
     */
    public static double rubleToDollar(double value) {
        return value / 75;
    }
}
