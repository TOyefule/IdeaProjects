package com.company;

import java.util.Scanner;

public class Loops1 {

    public void doSomething(String prompt){

        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        String input = keyboard.nextLine();
        System.out.println(input);


        keyboard.close();
    }
    /*
    // 1. Write a program that prints the numbers 1-10.
        System.out.println();

                System.out.println("Numbers from 1 - 10");
                for (int i = 0; i <= 10; i++){
        System.out.println(i);
    }

    // 1. Write a program that prints the numbers 1-10 backwards.
        System.out.println();

                 System.out.println("Numbers backwards from 1 - 10");
                 for (int i = 10; i >= 1; i--){
        System.out.println(i);
    }
    // 2. Write a program that prints all the odd numbers from 1-20.
        System.out.println();

                System.out.println("Odd numbers from 1 - 20");
                for (int i = 1; i <= 20; i += 2 ) {
        System.out.println(i);
    }
    // 3. Write a program that prints all the even numbers from 1-20.
        System.out.println();

                 System.out.println("Even numbers from 1 - 20");
                 for (int i = 0; i <= 20; i += 2 ) {
        System.out.println(i);
    }


    // 4. Have the user input a number and print all numbers from that
    // input value to 1.
        System.out.println();

                System.out.println("Input any number greater than 1");
    Scanner keyboard = new Scanner(System.in);
    int myNum = keyboard.nextInt();

                for (int l = myNum; l >= 1 ; l-- ) {
        System.out.println(l);
        keyboard.close();
    }
    // 5. Sum all values from 1-10.
        System.out.println();

    // 6. Have the user enter a number and print the sum of all numbers from that inputted value to 1.
        System.out.println();
            System.out.println("Input any number greater than 1");
    Scanner keyboard = new Scanner(System.in);
    int myNum = keyboard.nextInt();

                for (int l = myNum; l >= 1 ; l-- ) {
        System.out.println(l);
        keyboard.close();

        // 8.
        System.out.println();
        System.out.println("Input any number greater than 1");
        Scanner keyboard = new Scanner(System.in);
        int myNum = keyboard.nextInt();

        for (int l = myNum; l >= 1 ; l-- ) {
            System.out.println(l);
            keyboard.close();

            // 9.
            System.out.println();
            System.out.println("Input any number greater than 1");
            Scanner keyboard = new Scanner(System.in);
            int myNum = keyboard.nextInt();

            for (int l = myNum; l >= 1 ; l-- ) {
                System.out.println(l);
                keyboard.close();


                // 10.
                System.out.println();
                System.out.println("Input any number greater than 1");
                Scanner keyboard = new Scanner(System.in);
                int myNum = keyboard.nextInt();

                for (int l = myNum; l >= 1 ; l-- ) {
                    System.out.println(l);
                    keyboard.close();
       */

}