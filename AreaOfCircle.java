package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter radius");
		 int radius=scanner.nextInt();
		 double area=3.14*radius*radius;
		 System.out.println("area of circle is : "+area);
		 scanner.close();
	}

}
