import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


            /*  1. Create a basic application
             *      Your 6 year old client needs an application that will receive an integer from
             *      the user banging on the keyboard, add 5 to it, double it,
             *      subtract 7 from it, and display the result to the screen..
             *
             */

            int userInput;
            System.out.println("Enter a Number..");

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();  //Pseudocode set int userInput = user input

            userInput += 5;

            userInput *= 2;

            userInput -= 7;

            System.out.println(userInput);    // Print(userInput)


        }
    }