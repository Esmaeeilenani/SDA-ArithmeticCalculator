package arithmeticcalculator;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            //Program menu
            System.out.println("Enter the arithmetic operations you want to proform");
            System.out.println("1.  addition");
            System.out.println("2.  subtraction");
            System.out.println("3.  multiplication");
            System.out.println("4.  division");
            System.out.println("0.  Exit");
            System.out.print("Enter your selection: ");
            int choice = in.nextInt();

            if (choice == 0) {
                System.out.println("\n\nthank you for using out calculator :)");
                System.exit(0);
            }

            //enter the number to profrom the operations on
            System.out.print("Enter tow numbers: ");
            double num1 = in.nextDouble(), num2 = in.nextDouble(), result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("the sum of "+num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("the subtraction of "+num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("the multiplication of "+num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("the division of "+num1 + " / " + num2 + " = " + result);
                    
                    break;
                default:
                    System.out.println("Wrong Selection try Again!!!!\n\n");
                    break;

            }
            System.out.println("");
        }

    }

}
