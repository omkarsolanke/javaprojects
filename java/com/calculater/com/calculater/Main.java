package com.calculater;

import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Gess my number(1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == mynumber){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                System.out.println("my number was :");
                System.out.println(mynumber);
            }
    
            else if(userNumber > mynumber){
                System.out.println("Your number is too large");
            }
            else{
            System.out.println("Your number is too small");
            }


        }while(userNumber > 0);
        
        System.out.println("My number was :");
        System.out.println(mynumber);
        
        
    }
}
