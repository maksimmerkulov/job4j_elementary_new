package ru.job4j.math;

/**
 * A utility class that defines basic arithmetic operations.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathFunction {

    /**
     * Returns the sum of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the sum of the two numbers
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Returns the difference between two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the difference of the two numbers
     */
    public static double minus(double first, double second) {
        return first - second;
    }

    /**
     * Returns the product of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the product of the two numbers
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Returns the quotient of two numbers.
     *
     * @param first  the dividend
     * @param second the divisor
     * @return the quotient of the two numbers
     */
    public static double divide(double first, double second) {
        return first / second;
    }
}
