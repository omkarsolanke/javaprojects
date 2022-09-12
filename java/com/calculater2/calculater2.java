package com.calculater2;

import java.util.Scanner;

public class calculater2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :- ");
        int a = sc.nextInt();
        System.out.println("Enter second number :- ");
        int b = sc.nextInt();

        System.out.println("Enter operaition(1.+sum \n,2.-sub \n,3.*mult \n,4./divd\n) :- ");
        int opr = sc.nextInt();

        if (opr == 1) {
            System.out.println(a+b);
        }
        else if (opr == 2) {
            System.out.println(a-b);
        }
        else if (opr == 3) {
            System.out.println(a*b);
        }
        else if (opr == 4) {
            System.out.println(a/b);
        }
        else{
            System.out.println("Enter correct opr number...");
        } 

    
    }
}