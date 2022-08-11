package com.Unicorn.WimpsStore;

import java.util.Scanner;

public class NumberBool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter zero");
        int num1  = input.nextInt();


        if(num1==0){
            System.out.println( "The Opposite number is "+1);
        }
        else
            System.out.println("The Opposite number is "+0);
    }
}
