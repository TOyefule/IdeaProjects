package com.company;



import
/*
	Write a program that prints the numbers from 1 to 100.

	For multiples of 3 print “Fizz” instead of the number.

	For the multiples of five print “Buzz”.

	For numbers which are multiples of both 3 and 5 print “FizzBuzz”.
*/
public class FizzBuzz {

    public static void main(String[] args) {



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


//import java.util.Scanner;

/*
 *      Fizzbuzz is a game about numbers and Memory
 *      Fizz = 3 and multiples of 3
 *      Buzz = 5 and multiples of 5
 *      Ask the User for a number to print up to.
 *      Input this number as the final number used.
 *      Starting from the number 1 print each consecutive number up to the user input number.
 *      Any multiple of 3 must print Fizz instead of the number.
 *      Any number that is divisible by 5 must print 'Buzz instead of the number.
 *      Any number that is a multiple of both 3 and 5 must print FizzBuzz instead of the number.
 *      The program will terminate after user input number is reached.
 */

// import java.util.Scanner;
//
//public class FizzBuzz {
//
//    public void FizzBuzz(int num) {
//
//            /*  int num:
//             *  int i: counter
//             int myFbNum: FB number to count up to;
//             */
//
////        System.out.println("Input any number to FizzBuzz up to: ");
////        Scanner myFbNum = new Scanner(System.in);
////        int myFbNum = keyboard.nextInt();
//
//        for (i = 1; i = 100; i++) {
//            if (i % 3 = 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 = 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 = 0 && i % 5 = 0) {
//                System.out.println("FizzBuzz");
//            }
//        }

//    }
//}