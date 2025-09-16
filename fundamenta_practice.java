package Fundamental_Practice_Problem;

import java.util.Scanner;

public class java_fundamentals {
    public static void main(String[] args) {

    // *************** ASSISTED PROBLEMS *******************

    //1-
        System.out.println("Welcome to Bridgelabz!");


    //2-
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);


    //3-
        sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();


    //4-
        sc = new Scanner(System.in);
        System.out.print("Enter rad of circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);


    //5-
        sc = new Scanner(System.in);
        System.out.print("Enter rad of cylinder: ");
        double rad = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * rad * rad * height;
        System.out.println("Volume of Cylinder: " + volume);


    //***************** SELF PROBLEMS******************


    //1-
        sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);


    //2-
        sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);


    //3-
        sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);


    //4-
        sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num3 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num4 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num5 = sc.nextDouble();

        double average = (num3 + num4 + num5) / 3;
        System.out.println("Average: " + average);


    //5-
        sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
        sc.close();

    }

}