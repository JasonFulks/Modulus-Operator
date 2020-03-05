package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
        lastDigit();


    }


    public static void testOddness() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        System.out.println("Give me a positive number.");
        number = keyboard.nextInt();
        System.out.println("Number is even " + (number % 2 == 0));
        System.out.println("Number is odd " + (number % 2 != 0));


    }

    public static void keepContained() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        System.out.println("Give me a positive number.");
        number = keyboard.nextInt();
        System.out.println("Number contained is " + ((number % 8) + 5));

    }

    public static void lastDigit() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        System.out.println("Give me a four digit, positive number.");
        number = keyboard.nextInt();
        System.out.println("The last digit is " + (number%10));


    }
}

