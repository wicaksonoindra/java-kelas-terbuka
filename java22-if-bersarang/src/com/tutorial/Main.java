package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // nested if
        int a = 5;
        int b = 10;

        System.out.println("ini adalah awal dari laptop program");
        if (a==5){
            if (b==10){
                System.out.println("ini adalah dimana a=5 dan b=10");
            }else{
                System.out.println("ini adalah dimana a=5 dan b bukan 10");
            }
        }else{
            System.out.println("ini adalah dimana a dan b salah");
        }
        System.out.println("ini adalah akhir dari program");

    }

}
