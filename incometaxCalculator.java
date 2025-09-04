package com.codegnan.fundamentals;
import java.util.Scanner;

public class incometaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        double taxRate;
        if (salary < 300000) {
            taxRate = 0.05; // 5%
        } else if (salary <= 1000000) {
            taxRate = 0.10; // 10%
        } else {
            taxRate = 0.15; // 15%
        }
         double tax = salary * taxRate;

        
        if (salary > 2000000) {
            tax += tax * 0.01;  // Add 1% of the calculated tax as bonus
        }

        System.out.println("Salary: " + salary);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Total Tax: " + tax);

        sc.close();
    }
}
