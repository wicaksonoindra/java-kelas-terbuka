package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // switch case

        // ekspresinya bisa berupa satuan (int,long,byte,short), string, atau enum

        Scanner inputUser = new Scanner(System.in);
        String input;

        System.out.print("panggil nama: ");
        input = inputUser.next();

        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir bos!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir bos!!");
                break;
            default:
                System.out.println(input + " tidak hadir bos!!");
        }

        System.out.println("selesai program");

    }

}
