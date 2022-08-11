package com.Unicorn.WimpsStore;
import java.util.Scanner;

public class SortNumber {
    private int numberFinder;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber= input.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber= input.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber= input.nextInt();
        System.out.println("Enter Fourth Number");
        int fourthNumber= input.nextInt();
        System.out.println("Enter Fifth Number");
        int fifthNumber= input.nextInt();
        System.out.println ("The Largest number is : "+ Math.max(firstNumber, (Math.max(secondNumber, Math.max(thirdNumber, Math.max(fourthNumber, fifthNumber))))));
        System.out.println ("The Smallest  number is : "+ Math.min(firstNumber, (Math.min(secondNumber, Math.min(thirdNumber, Math.min(fourthNumber, fifthNumber))))));
    }
}
