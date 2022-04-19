package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = GetInput("Enter a string: ");
        String strReversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + strReversed);
    }
    public static String GetInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
}