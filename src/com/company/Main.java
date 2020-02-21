package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
    }


        public static void testOddness(){
	 Scanner keyboard;
	 keyboard = new Scanner (System.in);
	 int number;
            System.out.println("Give me a positive number.");
            number = keyboard.nextInt();
            System.out.println("Number is even " + (number % 2==0));
            System.out.println("Number is odd " + (number % 2!=0));
    }
}
