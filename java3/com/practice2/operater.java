package com.practice2;

import java.util.Scanner;

public class operater {
    public static void main(String[] arcStrings) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,l,m,n;
        
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=i-j;k++){
                System.out.print(" ");
            }
            for(l=1;i<=i;l++){
                System.out.print("*");
            }
            for(m=1;m<=2*i-j;m++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=i-j;k++){
                System.out.print(" ");
            }
            for(l=1;i<=i;l++){
                System.out.print("*");
            }
            for(m=1;m<=2*i-j;m++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
