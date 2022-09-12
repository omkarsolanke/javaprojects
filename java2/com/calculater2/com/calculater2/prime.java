

package com.calculater2;
import java.util.*;



class prime{
    public static void main(String args[]){
        Scanner bin = new Scanner(System.in);
        System.out.print("Enter a number :");

        int num = bin.nextInt();
        int flag = 0;

        for(int i =2;i<num;i++){
            if(num% i ==0){
                System.out.println(num+" number is not prime");
                flag=1;
                break;
            }

        }
        if(flag==1){
            System.out.println(num+" number is prime");
        }





    }
}