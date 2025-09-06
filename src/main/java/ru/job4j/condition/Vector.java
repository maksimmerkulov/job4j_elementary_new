package ru.job4j.condition;

/**
 * A utility class for performing vector operations.
 *
 * <p>Example output:</p>
 * <pre>{@code
 * result (1, 2) + (3, 4) = (4, 6)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Vector {

    /**
     * Returns the sum of two vectors.
     *
     * @param x1 the x-coordinate of the first vector
     * @param y1 the y-coordinate of the first vector
     * @param x2 the x-coordinate of the second vector
     * @param y2 the y-coordinate of the second vector
     * @return the resulting vector as a string
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Starts the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}
