package com.codegnan.fundamentals;

import java.util.Scanner;

public class CanteenSystems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teaPrice = 10, cofeePrice = 15, samosaPrice = 20;
        int teaQty = 0, cofeeQty = 0, samosaQty = 0;
        int choice;
        double taxRate = 0.05;

        do {
            System.out.println("||=========== Canteen Menu ===========||");
            System.out.println("||=========== 1. View Menu ===========||");
            System.out.println("||=========== 2. Order Items =========||");
            System.out.println("||=========== 3. View Bill ===========||");
            System.out.println("||=========== 4. CheckOut and Exit ===||");
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-------- MENU -----------");
                    System.out.println("1. Tea - $" + teaPrice);
                    System.out.println("2. Coffe - $" + cofeePrice);
                    System.out.println("3. Samosa - $" + samosaPrice);
                    break;

                case 2:
                    System.out.println("Enter Item Number to Order (1-3)");
                    int item = scanner.nextInt();
                    System.out.println("Enter Quantity");
                    int qty = scanner.nextInt();

                    if (qty <= 0) {
                        System.out.println("Quantity Must Greater Than 0");
                        break;
                    }

                    switch (item) {
                        case 1:
                            teaQty += qty;
                            System.out.println(qty + " Tea(s) Added");
                            break;
                        case 2:
                            cofeeQty += qty;
                            System.out.println(qty + " Coffee(s) Added");
                            break;
                        case 3:
                            samosaQty += qty;
                            System.out.println(qty + " Samosa(s) Added");
                            break;
                        default:
                            System.out.println("Invalid Item Number");
                            break;
                    }
                    break;

                case 3:
                    int teaTotal = teaQty * teaPrice;    // tea total price
                    int cofeeTotal = cofeeQty * cofeePrice;  // coffee total price
                    int samosaTotal = samosaQty * samosaPrice; // samosa total price
                    int subTotal = teaTotal + cofeeTotal + samosaTotal; // subtotal for all items
                    double tax = subTotal * taxRate;  // tax amount
                    double grandTotal = subTotal + tax;  // grand total

                    System.out.println("=========== BILL ===========");
                    if (teaQty > 0) {
                        System.out.println("Tea x " + teaQty + " = $" + teaTotal);
                    }
                    if (cofeeQty > 0) {
                        System.out.println("Coffee x " + cofeeQty + " = $" + cofeeTotal);
                    }
                    if (samosaQty > 0) {
                        System.out.println("Samosa x " + samosaQty + " = $" + samosaTotal);
                    }
                    if (subTotal == 0) {
                        System.out.println("No Items Ordered Yet");
                    } else {
                        System.out.println("SubTotal = " + subTotal);
                        System.out.println("Tax(5%) = " + tax);
                        System.out.println("Grand Total = " + grandTotal);
                    }
                    break;

                case 4:
                    System.out.println("Thank You! Exiting System");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Enter A number 1 to 4");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}