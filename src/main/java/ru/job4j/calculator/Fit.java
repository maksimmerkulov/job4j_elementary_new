package ru.job4j.calculator;

/**
 * A program that calculates the ideal weight for men and women.
 *
 * <p>Example output:</p>
 * <pre>{@code
 * Man 187 cm is 100.05 kg
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fit {

    /**
     * Returns the ideal weight for a man.
     *
     * @param height the height in centimeters
     * @return the ideal weight for a man
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Returns the ideal weight for a woman.
     *
     * @param height the height in centimeters
     * @return the ideal weight for a woman
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Starts the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
