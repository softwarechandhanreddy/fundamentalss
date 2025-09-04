package com.codegnan.fundamentals;

import java.util.Scanner;

public class displaygrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        String grade = (marks >= 90) ? "O" :
                       (marks >= 80) ? "S" :
                       (marks >= 70) ? "A" :
                       (marks >= 60) ? "B" :
                       (marks >= 50) ? "C" :
                       (marks >= 40) ? "d" : "f";
        
        System.out.println("Grade: " + grade);
        sc.close();
    }
}