package com.practice2;

import java.util.Scanner;

public class practice2{
    public static void printmyname(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        String name = sp.nextLine();
        printmyname(name);
    }
}
