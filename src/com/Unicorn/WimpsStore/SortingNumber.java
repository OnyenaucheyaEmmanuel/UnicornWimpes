package com.Unicorn.WimpsStore;

import java.util.Scanner;

public class SortingNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int userInput =  input.nextInt();
        int largestNumber = userInput;
        int lowerNumber = userInput;

        int count = 1;
        while (count < 5){
            System.out.println("Enter Numbers : " + (count + 1));
             userInput = input.nextInt();
//           var  userInputIsLarger = userInput > largestNumber;
//            var  userInputIsLower = userInput> lowerNumber;
            if (userInput < lowerNumber){
                lowerNumber = userInput;
            }
            if (userInput > largestNumber){
                largestNumber = userInput;
            }
            count++;

        }
        System.out.println("The Largest Number is : " + largestNumber );
        System.out.println("The Lower Number is : " + lowerNumber );
    }


}

