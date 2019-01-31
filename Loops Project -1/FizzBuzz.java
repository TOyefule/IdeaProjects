package com.company;


// import java.util.Scanner;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//
//    Loops2 loops2 = new Loops2();
//            loops.doSomethingElse(prompt:"Enter your Loop Number: ");
//            return;
//    }
//}

//        public class FizzBuzz {
//            public void FizzBuzz(int num) {
            /*  int num:
             *  int i: counter
             int myFbNum: FB number to count up to;
             */

//        System.out.println("Input any number to FizzBuzz up to: ");
//        Scanner myFbNum = new Scanner(System.in);
//        int myFbNum = keyboard.nextInt();


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }

                else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

           else {
                System.out.println(i);
            }

        }
    }
}
