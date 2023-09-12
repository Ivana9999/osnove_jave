package p_12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
//    Kreirati klasu Sastojak koja ima:
//    naziv sastojka
//    cenu
//    gettere i settere
//            konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
// Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

    public static void main(String[] args) {
        ArrayList<Sastojak> sastojak = new ArrayList<>();

        Scanner s = new Scanner(System.in);
Sastojak sastojak1 = new Sastojak("so", 150);
Sastojak sastojak2 = new Sastojak("biber", 50);
Sastojak sastojak3 = new Sastojak("brasno",  85);



        int brojSastojka = s.nextInt();

        for (int i = 0; i< brojSastojka; i++) {
            System.out.println("Unesite sastojak: ");
            String naziv = s.next();
            System.out.println("Unesite cenu: ");
            int cena = s.nextInt();

            sastojak.add(new Sastojak(naziv, cena));

        }

        for (int i = 0; i < sastojak.size(); i++) {
            System.out.println(sastojak.get(i).getNazivSastojka() + "Cena: " + sastojak.get(i).getCena());
        }
    }
}
