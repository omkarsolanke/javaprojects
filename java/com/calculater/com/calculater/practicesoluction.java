package com.calculater;

import java.util.Scanner;

public class practicesoluction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        

        for(int i=1;i<=N;i++){
            if (i % 2 != 0) {
                System.out.println("Weird");
            }
            if (i % 2==0 || (N >=2 && N <= 5)) {
                System.out.println("Not Weird");
            }
            else if (i % 2==0 || (N >=6 && N <= 20)) {
                System.out.println("Weird");
            }
            if (i % 2==0 || N > 20) {
                System.out.println("Not Weird");
            }
            

            
        }
    }
}
