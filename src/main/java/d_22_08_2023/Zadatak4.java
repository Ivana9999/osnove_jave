package d_22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//                Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);

        int brojJed = 0;
        int brojDva = 0;

        while(brojJed < 3 && brojDva < 2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 1) {
                brojJed++ ;
            } else if (broj == 2 ) {
                brojDva++;
            }
        }
        System.out.println("Kraj programa.");







    }
}
