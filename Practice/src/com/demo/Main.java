package com.demo;

import java.util.Scanner;
/*
Create flowchart and pseudocode for the following:
Input a year and find whether it is a leap year or not.
Take two numbers and print the sum of both.
Take a number as input and print the multiplication table for it.
Take 2 numbers as inputs and find their HCF and LCM.
Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
*/

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
        switch (name) {
            case "Rahul" -> System.out.println("Hi Rahul How are you man");
            case "Manoj" -> System.out.println("Hi Manoj How are you man");
            case "Sohail" -> System.out.println("Hi Sohail");
            default -> System.out.println("yes I am man");
        }
    }
}

