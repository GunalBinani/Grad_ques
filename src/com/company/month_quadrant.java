package com.company;

import java.util.Scanner;

public class month_quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month :\n");
        int month= sc.nextInt();
        if(month>=1 && month<5){
            switch(month){
                case 1 :
                    System.out.println("January lies in the first quadrant");
                    break;
                case 2 :
                    System.out.println("Feb lies in the first quadrant");
                    break;
                case 3 :
                    System.out.println("March lies in the first quadrant");
                    break;
                case 4 :
                    System.out.println("april lies in the first quadrant");
                    break;
                default :
                    System.out.println("Doesnt lie in first quadrant");
            }
        }
        else if(month>=5 && month<9){
            switch(month){
                case 5 :
                    System.out.println("May lies in the second quadrant");
                    break;
                case 6 :
                    System.out.println("June lies in the second quadrant");
                    break;
                case 7 :
                    System.out.println("July lies in the second quadrant");
                    break;
                case 8 :
                    System.out.println("August lies in the second quadrant");
                    break;
                default :
                    System.out.println("Doesnt lie in second quadrant");
            }
        }
        else if(month>=9 && month<13){
            switch(month){
                case 9 :
                    System.out.println("Sept lies in the first quadrant");
                    break;
                case 10 :
                    System.out.println("Oct lies in the first quadrant");
                    break;
                case 11 :
                    System.out.println("Nov lies in the first quadrant");
                    break;
                case 12 :
                    System.out.println("December lies in the first quadrant");
                    break;
                default :
                    System.out.println("Doesnt lie in third quadrant");
            }
        }

    }
}
