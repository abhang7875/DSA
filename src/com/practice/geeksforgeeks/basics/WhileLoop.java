package com.practice.geeksforgeeks.basics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // code here
        int i = 0;
        while(i < n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print(n);
    }
}
