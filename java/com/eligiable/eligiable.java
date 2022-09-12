package com.eligiable;

import java.util.Scanner;

public class eligiable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Best Of Luck ...");
        System.out.println("Enter your name :-  ");
        String name = sc.nextLine();

        System.out.println("Enter your Marks : ");
        int Marks = sc.nextInt();
        do{
        if (Marks >= 50) {
            System.out.println("WOOHOO.....you are eligible \n\n");
            System.out.println("Enter your mobile Number :- ");
            int number = sc.nextInt();
            System.out.println("\n\n\n\n\n\n");

            System.out.println("Hello,"); System.out.println(name);
            System.out.println("We will contact you on mobile number :-");
            System.out.println(number);
            System.out.println("\n\n");
            

        }
        else{
        System.out.println("Try your best next year... \n\n");
        }
        }while(Marks == 0);
        System.out.println();

    


    }
}
