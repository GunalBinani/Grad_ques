package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //take user input
        //initialize empty string for checking later
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String palin;
        palin = sc.nextLine();
        String temp="";
        for (int i = palin.length()-1; i >= 0 ; i--) {
            temp = temp +  palin.charAt(i);
        }
        if (temp.equals(palin)) {
            System.out.println("Input is palindrome");
        }
        else
            System.out.println("Input is not palindrome");
    }
}
