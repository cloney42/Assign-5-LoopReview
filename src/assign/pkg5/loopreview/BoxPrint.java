package assign.pkg5.loopreview;
/*
 Name: Ryan Porter
 Assignment: Assignment 5
 Period 7
 Date: 10/16/15
 Course: AP Computer Science
 */

import java.util.Scanner;

public class BoxPrint {

    static Scanner input = new Scanner(System.in);
    static int i = 0;

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String message = input.nextLine();
        outputBox(message);
    }

    public static void outputBox(String message) {
        int length = message.length();
        if (length > 20) {
            message = message.substring(0, 20);
            length = 20;
        }
        int topBottom = length + 6;
        int space = length + 2;
        int i = 0;
        printTopBottom(topBottom);
        printSide();
        printSpace(space);
        printSide2();
        printSide();
        printMessage(message);
        printSide2();
        printSide();
        printSpace(space);
        printSide2();
        printTopBottom(topBottom);
    }

    public static void printTopBottom(int topBottom) {
        i = 0;
        while (i < topBottom) {
            System.out.print("@");
            i++;
        }
        System.out.print("\n");
    }

    public static void printSide() {
        System.out.print("@@");
    }

    public static void printSide2() {
        System.out.print("@@\n");
    }

    public static void printSpace(int space) {
        i = 0;
        while (i < space) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printMessage(String message) {
        System.out.print(" ");
        System.out.print(message);
        System.out.print(" ");
    }
}
