package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // operator komparasi menghasilkan dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // operator equal
        System.out.println("----- PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // operator not equal
        System.out.println("----- PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        // operator less than
        System.out.println("----- KURANG dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        // operator greater than
        System.out.println("----- LEBIH dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        // operator less than equal
        System.out.println("----- KURANG dari sama dengan");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        // operator greater than equal
        System.out.println("----- LEBIH dari sama dengan");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

    }

}
