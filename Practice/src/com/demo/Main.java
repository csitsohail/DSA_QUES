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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls Provide the number");
        while (true) {
            int num = scanner.nextInt();

            char userEnter = scanner.next().toLowerCase().trim().charAt(0);
            if (userEnter=='x'){
                break;
            }
        }
    }
}


