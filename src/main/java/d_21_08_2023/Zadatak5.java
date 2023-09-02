package d_21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
//(Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//    Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja. (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
//    Random brojevi u Javi se generisisu kao u primeru
//    Primer izvrsenja:
//    Koliko je 1 + 4? 5
//    Cestitam!
//    Koliko je 3 + 34? 23
//    Greska!
//    Koliko je 23 + 12? 45
//    Greska!
//    Koliko je 23 + 12? 24
//    Greska!
//    Koliko je 1+ 4? 5
//    Cestitam!

    public static void main(String[] args) {
        Random random = new Random();



        for (int i = 0; i <= 5; i++) {
            int broj1  = random.nextInt(51);
            int broj2 = random.nextInt(51);

            int tacanOdgovor = broj1 + broj2;

             System.out.println("Koliko je " + broj1 + " + " + broj2 + " ?");

            int korisnikovOdgovor = random.nextInt(101);

             if( korisnikovOdgovor == tacanOdgovor) {
                 System.out.println(  tacanOdgovor);
                 System.out.println("Cestitam!");
             } else
                 System.out.println("Greska! ");



        }
    }
}