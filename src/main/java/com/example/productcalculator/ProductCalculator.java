package com.example.productcalculator;

import java.util.Scanner;

public class ProductCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            System.out.println("Enter five numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = scanner.nextInt();
            }

            int product = calculateProduct(numbers, 5);
            System.out.println("The product of the entered numbers is: " + product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive method to calculate product
    public static int calculateProduct(int[] numbers, int n) {
        if (n == 1) {
            return numbers[0];
        } else {
            return numbers[n - 1] * calculateProduct(numbers, n - 1);
        }
    }
}

