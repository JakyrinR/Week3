package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your Name?");
        String input = keyboard.nextLine();
        System.out.println("Hello " + keyboard.nextLine());


    }
}
