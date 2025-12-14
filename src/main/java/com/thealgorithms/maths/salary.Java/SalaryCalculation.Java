package com.thealgorithms.maths.salary;


/**
 * Simple salary calculation example.
 * Demonstrates basic arithmetic operations in Java.
 */
public class SalaryCalculation {

    /**
     * Calculates the salary based on worked hours and hourly rate.
     *
     * @param hoursWorked number of hours worked
     * @param hourlyRate  payment per hour
     * @return calculated salary
     */
    public static double calculate(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        double hoursWorked = 160;
        double hourlyRate = 25.0;

        double salary = calculate(hoursWorked, hourlyRate);
        System.out.println("Salary: " + salary);
    }
}
