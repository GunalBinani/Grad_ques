package com.company;

import java.util.Scanner;

public class Boo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int amt = sc.nextInt();
        int twos = 0;
        int one = 0;
        int tens = 0;
        int fives = 0;
        int rem = 0;
        //check for tens
        if ((amt / 10) > 0) {
            tens = amt / 10;
            rem = amt % 10;
        }
        //check for fives
        if (rem >= 5) {
            fives = 1;
            rem = rem - 5;
        }
        //check for twos
        if (rem >= 2) {
            twos = rem / 2;
        }
        //check for ones
        if (rem% 2 >= 1) {
            one = 1;
        }
        //sout
        System.out.println("No. of tens are : " + tens);
        System.out.println("No. of fives are : " + fives);
        System.out.println("No. of twos are : " + twos);
        System.out.println("No. of ones are : " + one);
    }
}
