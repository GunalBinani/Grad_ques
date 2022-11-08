package com.company;

import java.util.Scanner;

public class generate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting index:");
        int start_main= sc.nextInt();
        System.out.println("enter ending index:");
        int end_main = sc.nextInt();
        System.out.println("enter iterator:");
        int iter = sc.nextInt();
        generate_array ob = new generate_array();
        ob.gen_range(start_main,end_main,iter);
        int[] a = new int[end_main/iter];
        int c=0;
        //for (int i = start_main; i <=end_main ; i=i+iter) a[c++] = i;
        //c=0;
        //for (int i = start_main; i <=end_main ; i++) System.out.println(a[c++]);


    }
    void gen_range(int start, int last, int iterate){
        int[] a = new int[last/iterate];
      int c=0;
      for (int i = start; i <=last ; i=i+iterate){
          a[c++] = i;}
      c=0;
        for (int i = start; i <=last; i++) System.out.println(a[c++]);
    }
}
