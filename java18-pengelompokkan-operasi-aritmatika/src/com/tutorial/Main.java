package com.tutorial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Perkalian atau pembagian akan di lakukan terlebih dahulu
        // Jika dilakukan perkalian dan pembagian, akan diutamakan operasi dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // Menggunakan pengelompokkan
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // Perhitungan persamaan kuadrat
        System.out.println(" MENGIHTUNG PERSAMAAN KUADRAT ");
        int m,x,c;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradien m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = m*x*x + c;

        System.out.println("nilai y = " + y);

    }

}
