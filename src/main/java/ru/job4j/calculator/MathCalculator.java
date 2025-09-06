package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * A calculator that combines results of basic arithmetic operations.
 *
 * <p>Example output:</p>
 * <pre>{@code
 * Addition and multiplication: 230.0
 * Subtraction and division: -9.5
 * Total: 220.5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathCalculator {

    /**
     * Returns the result of adding the sum and product of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the combined result of addition and multiplication
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    /**
     * Returns the result of adding the difference and quotient of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the combined result of subtraction and division
     */
    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    /**
     * Returns the sum of all arithmetic operation results.
     *
     * @param first  the first number
     * @param second the second number
     * @return the sum of all operations
     */
    public static double totalSum(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    /**
     * Starts the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Addition and multiplication: "
                + sumAndMultiply(10, 20));
        System.out.println("Subtraction and division: "
                + minusAndDivide(10, 20));
        System.out.println("Total: " + totalSum(10, 20));
    }
}
