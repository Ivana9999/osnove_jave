package p_21_08_2023;

import java.util.Scanner;

public class Zadatak11 {
//    (ZA VEZBANJE)Napisati program prikazuje koliko je svaki od unetih
//   passworda jak. Korisnik unosi N passworda i za svaki se ispisuje jacina.
//    Svaki uslov koji password ispunjava dodaje po 1 poen:
//    duzina veca od 8
//    sadrzi @ specijalan karakter
//
//    Primer izvrsenja:
//    Unesite N: 3
//    Unesite password: passwdr
//    Password ima 0 poena.
//    Unesite password: password123
//    Password ima 1 poena.
//    Unesite password: password@123
//    Password ima 2 poena.
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite password: ");
            String password = s.next();
            int jacina = 0;
            if (password.length() > 8) {
                jacina++;
            }
            if (password.contains("@")) {
                jacina++;
            }
            System.out.println("Password ima: " + jacina + " poena.");

        }























    }
}
