package com.calculater2;

import java.util.Scanner;

public class projectjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colum = sc.nextInt();
        int raws = sc.nextInt();
        int[][] num = new int[raws][colum];
        for (int i = 0; i <= raws; i++) {
            for (int j = 0; j <= colum; j++) {
                System.out.println(num+" ");
            }
        }
        

    }
}
