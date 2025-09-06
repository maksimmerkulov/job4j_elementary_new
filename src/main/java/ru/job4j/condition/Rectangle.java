package ru.job4j.condition;

/**
 * A utility class for computing rectangle properties.
 *
 * <p>Example output:</p>
 * <pre>{@code
 * Diagonal of rectangle with length 3 and width 4 is 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Rectangle {

    /**
     * Returns the length of a rectangle diagonal.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @return the length of the rectangle diagonal
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Starts the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println(
                "Diagonal of rectangle with length 3 and width 4 is " + result
        );
    }
}
