package com.calculater2;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N%2!=0) {
        System.out.println("Weird");
    }
    if (N%2==0 && (N>2 && N<5) && N>20) {
        System.out.println("Not Weird");
    }
    if (N%2==0 && N>20) {
        System.out.println("Not Weird");
    }
    if (N%2==0 && (N>=6 && N<=20)) {
        System.out.println("Weird");
    }

    double d = sc.nextDouble();
    String s = sc.nextLine();
    


    }
}
