/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String firstNumberStr = s.nextLine();
        int firstNumber = Integer.parseInt(firstNumberStr);

        System.out.println("What is the second number? ");
        String secondNumberStr = s.nextLine();
        int secondNumber = Integer.parseInt(secondNumberStr);

        System.out.println(
                String.format(
                        "%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",
                        firstNumber, secondNumber, firstNumber + secondNumber,
                        firstNumber, secondNumber, firstNumber - secondNumber,
                        firstNumber, secondNumber, firstNumber * secondNumber,
                        firstNumber, secondNumber, firstNumber / secondNumber
                )
        );
    }
}
