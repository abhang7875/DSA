package com.practice.geeksforgeeks.basics;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(n < m) {
            System.out.print("less");
        } else if(n == m) {
            System.out.print("equal");
        } else {
            System.out.print("greater");
        }
    }
}
