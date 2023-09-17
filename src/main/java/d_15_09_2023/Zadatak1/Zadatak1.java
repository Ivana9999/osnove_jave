package d_15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//    jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//     (ime i prezime), (jmbg), (godina rodjenja)
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        for(int i = 0; i < 2 ;i++) {

            System.out.println("Unesite podatke o igracu: ");

            System.out.print("Uneiste ime i prezime igraca: ");

            String imeIPrezimeIgraca = s.next();


            System.out.print("Unesite JMBG igraca: ");

            int jmbgIgraca = s.nextInt();


            System.out.print("Unesite godinu rodjenja igraca: ");

            int godinaRodjenja = s.nextInt();

            System.out.print("Unesite broj koji igrac nosi na dresu");

            int broj = s.nextInt();

            System.out.print("Unesite poziciju igraca");
            String pozicija = s.next();

            System.out.print("Da li je ovaj igrac kapiten ?");
            boolean daliJeKapiten = s.nextBoolean();

            igraci.add( new Igrac(imeIPrezimeIgraca, jmbgIgraca, godinaRodjenja, broj, pozicija,daliJeKapiten));
        }


        System.out.println("Unesite podatke o trenerima");

for(int i = 0; i < 2; i++) {

    System.out.print("Uneiste ime i prezime trenera: ");

    String imeIPrezimeTrenera = s.next();

    System.out.print("Unesite JMBG trenera: ");

    int jmbgTrenera = s.nextInt();

    System.out.print("Unesite godinu rodjenja trenera: ");

    int godinaRodjenja = s.nextInt();

    System.out.print("Unesite koligo godina iskustva ima trener: ");

    int godineIskustva = s.nextInt();

    System.out.print("Unesite tip trenera");

    String tipTrenera = s.next();

    treneri.add(new Trener(imeIPrezimeTrenera, jmbgTrenera, godinaRodjenja, godineIskustva, tipTrenera));

}


for(int i = 0; i< igraci.size(); i++) {
    igraci.get(i).stampaj();
}

for (int i = 0; i< treneri.size(); i++) {
    treneri.get(i).stampaj();
}



    }
}
