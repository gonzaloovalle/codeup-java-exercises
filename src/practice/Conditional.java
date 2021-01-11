package practice;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();


        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);


        System.out.print("Input value: ");
        double inpt = in.nextDouble();

        if (input > 0)
        {
            if (inpt < 1)
            {
                System.out.println("Positive small number");
            }
            else if (inpt > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (inpt < 0)
        {
            if (Math.abs(inpt) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(inpt) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }

}

