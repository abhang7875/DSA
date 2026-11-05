package com.practice.geeksforgeeks.basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i = 1; i <= 10; i++) {
            System.out.print((n * i) + " ");
        }
    }
}
