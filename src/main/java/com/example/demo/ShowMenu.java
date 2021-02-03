package com.example.demo;

import java.util.Scanner;

public class ShowMenu {

    Scanner sc = new Scanner(System.in);

    public void printMenu(){
        System.out.println("1. To withdraw money.");
        System.out.println("2. Check the invoice.");
        System.out.println("3. To add money.");
        System.out.print("Please choose one option: ");
    }

    public void ptintCheckMenu(){
        System.out.println("Please enter your card number and then password");
    }


}
