package d_07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Film film1 = new Film();

        System.out.println("Unesite informacije o prvom filmu:");
        System.out.print("Naslov: ");
        String naslov1 = s.next();
        System.out.print("Godina izdanja: ");
        int godinaIzdanja1 = s.nextInt();
        System.out.print("Režiser: ");
        String reziser1 = s.next();

        film1.naslov = naslov1;
        film1.godinaIzdanja = godinaIzdanja1;
        film1.reziser = reziser1;



        Film film2 = new Film();

        System.out.println("Unesite informacije o drugom filmu:");
        System.out.print("Naslov: ");
        String naslov2 = s.next();
        System.out.print("Godina izdanja: ");
        int godinaIzdanja2 = s.nextInt();
        System.out.print("Režiser: ");
        String reziser2 = s.next();

        film2.naslov = naslov2;
        film2.godinaIzdanja = godinaIzdanja2;
        film2.reziser = reziser2;


        Film film3 = new Film();

        System.out.println("Unesite informacije o trecem filmu:");
        System.out.print("Naslov: ");
        String naslov3 = s.next();
        System.out.print("Godina izdanja: ");
        int godinaIzdanja3 = s.nextInt();
        System.out.print("Režiser: ");
        String reziser3 = s.next();

        film3.naslov = naslov3;
        film3.godinaIzdanja = godinaIzdanja3;
        film3.reziser = reziser3;

        System.out.println("Naslov prvog filma: " + film1.naslov + " Godina izdanja: " + film1.godinaIzdanja + " Reziser: " + film1.reziser );
        System.out.println("Naslov drugog filma: " + film2.naslov + " Godina izdanja: " + film2.godinaIzdanja + " Reziser: " + film2.reziser );
        System.out.println("Naslov treceg filma: " + film3.naslov + " Godina izdanja: " + film3.godinaIzdanja + " Reziser: " + film3.reziser );
    }
}
