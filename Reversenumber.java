package com.codegnan.fundamentals;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int num = Math.abs(n); // Take absolute value first
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        // Always make result negative
        rev = -rev;

        System.out.println("Reversed number (always negative): " + rev);
        sc.close();
    }
}

