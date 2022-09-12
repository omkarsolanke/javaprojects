package com.practicejava;

import java.net.SocketTimeoutException;
import java.util.Random;
import java.util.Scanner;


public class practice{
    
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("AI : GOOD LUCK ");
        System.out.println("AI : What Is Your Name");
        System.out.print("YOU : ");
        String name = sc.nextLine();
        System.out.println("AI : HI "+ name);
        System.out.println("AI : How Many Marks You Get");
        System.out.print("YOU :");
        int Marks = sc.nextInt(); 
        int rand = (int)(Math.random()*100000);
        System.out.println("AI : Enter Given Number");
        System.out.println(rand);
        System.out.print("YOU : ");
        int moniter = sc.nextInt();
        
        
        if (Marks>=80) {
            System.out.println("AI : WOOHOO...YOU ARE ELIGIABLE FOR THIS....");
            System.out.println();
            System.out.println();
            System.out.println("AI : Enter Your Mobile Number");
            System.out.print("You : ");
            int num = sc.nextInt();
            
            
            System.out.println("\n\n\n\n\n"); 
            System.out.println("AI : Hello "+name);
            System.out.println("AI : We will Send You Massage On Mobile Number "+num);
            
        
         }
         else{
            System.out.println("AI : TRY YOUR BEST NEXT YEAR....");
            
         }
       
        System.out.println("AI : Thank You");
     }
}
