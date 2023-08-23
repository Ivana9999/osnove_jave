package p_22_08_2023;

import java.util.Scanner;


//Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:2
//        Unesite broj:3
//        Unesite broj:0
//        Unesite broj:5
//        Unesite broj:3
//        Unesite broj:4
//        Kraj programa
//
//        Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.


public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int brojJedan = 0;
        int brojDva = 0;
        int brojTri = 0;
        int brojCetiri = 0;


        while (brojJedan < 1 || brojDva < 1 || brojTri < 1 || brojCetiri < 1) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if(broj == 1) {
                brojJedan++;
            } else if (broj == 2) {
                brojDva++;
            } else if (broj == 3) {
                brojTri++;
            } else if (broj == 4) {
                brojCetiri++;
            }

        }


        System.out.println("Kraj programa.");




    }
}
