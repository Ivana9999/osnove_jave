package p_25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
//    Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//    Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//    N=5, print je=> * * * * *
//
//    Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//    N=9, print je=> * * * * * * * * *
//

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 1; i < n; i++) {
            zvezde(i);
            System.out.println();
        }

        zvezde(n);
    }

    public static void zvezde(int broj) {
        for (int i = 0; i < broj; i++) {
            System.out.print("* ");
        }














    }
}
