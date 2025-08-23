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
        for (int i = 0; i <1000; i++) {
            arm(i);
        }
    }
        static void arm ( int val) {
            int num = val;
            int news = 0;
            while (num > 0) {
                int rem = num % 10;
                rem = rem * rem * rem;
                news = news + rem;
                num = num / 10;
            }
            if (news==val){
            System.out.println(news);
        }}
}


