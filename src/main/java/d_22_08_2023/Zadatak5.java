package d_22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//        Primer izvrsenja 2:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: =
//        Zagrade nisu uparene
//                (Objasnjenje: fali poslednja zagrada iz formule)

        Scanner s = new Scanner(System.in);

        String uparenostZagrada = " ";
       int a = 0;
       int b = 0;


        while(!uparenostZagrada.equals("=")) {
            System.out.print("Unos: ");
            uparenostZagrada= s.next();

            if (uparenostZagrada.equals("(")) {
                a = a + 1;
            } else if (uparenostZagrada.equals(")")) {
                b = b + 1;
            }


        }
        if (a == b) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene");


        }










    }
}
