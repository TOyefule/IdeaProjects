package com.company;

import java.util.Scanner;

public class Loops2 {
    public void doSomethingElse(String prompt) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        String input = keyboard.nextLine();
        System.out.println(input);
    }
}
