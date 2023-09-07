package VezbanjeTest;

import java.util.Scanner;

public class Zadatak3 {
//    Zadatak (While petlja)
//    Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//    Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//    specijalna karaktera a specijalni karakteri su @ i #
//    Primer izvrsenja:
//    Unesite lozinku: ITBootcamp
//    Lozinka nije validna.
//    Unesite lozinku: ITBootcamp12
//    Lozinka nije validna.
//    Unesite lozinku: ITBoo@
//    Lozinka nije validna.
//    Unesite lozinku: ITBootcamp@
//    Lozinka je validna.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean isValid = false;
        String lozinka = "";


        while (!isValid) {

            System.out.print("Unesite lozinku: ");
            lozinka = s.next();

            if (lozinka.length() >=8 && (lozinka.contains("@") || lozinka.contains("#"))) {
                System.out.println("Lozinka je validna. ");
                isValid=true;
            } else {
                System.out.println("Lozinka nije validna.");
            }
        }









    }
}
