package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ternary operator

        Scanner inputUser = new Scanner(System.in);
        int input,x;

        System.out.print("Masukkan nilai: ");
        input = inputUser.nextInt();

        // variable x = expresi ? statement true: statement false
        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("Hasilnya " + x);

    }

}
