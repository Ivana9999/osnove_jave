package miniProjekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
//    Generisanje Random Passworda sa Specijalnim Karakterom**
//
//    Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//    Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//            generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//            generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//            Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//    Glavni program:
//            - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//            - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//    Primer izvršenja 1:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: true
//    Generisan password: eD9Kx0e@
//
//    Primer izvršenja 2:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: false
//    Generisan password: eCxdwEeFEx

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();
        System.out.print("Da li zelite da sadrzi specijalan karakter: " );
        boolean speckarakter = s.nextBoolean();
        String generisanPassword = "";

        if(speckarakter==true) {
            duzinaPassworda--;
        }

        for (int i = 0; i < duzinaPassworda; i++) {
                String randomSlovo = generisiRandomKarakter();
                generisanPassword = generisanPassword + randomSlovo;

        }

        if(speckarakter==true){
            String specijalanKarakter = generisiRandomSpecijalanKarakter();
            generisanPassword = generisanPassword + specijalanKarakter;
        }

        System.out.println("Generisan password: " + generisanPassword);



    }

    public static String generisiRandomKarakter() {
        Random random = new Random();
        ArrayList<String> nizKaraktera = new ArrayList<>();
        nizKaraktera.add("a");
        nizKaraktera.add("b");
        nizKaraktera.add("c");
        nizKaraktera.add("d");
        nizKaraktera.add("e");
        nizKaraktera.add("f");
        nizKaraktera.add("g");
        nizKaraktera.add("h");
        nizKaraktera.add("i");
        nizKaraktera.add("j");
        nizKaraktera.add("k");
        nizKaraktera.add("l");
        nizKaraktera.add("m");
        nizKaraktera.add("n");
        nizKaraktera.add("o");
        nizKaraktera.add("p");
        nizKaraktera.add("q");
        nizKaraktera.add("r");
        nizKaraktera.add("s");
        nizKaraktera.add("t");
        nizKaraktera.add("u");
        nizKaraktera.add("v");
        nizKaraktera.add("w");
        nizKaraktera.add("x");
        nizKaraktera.add("y");
        nizKaraktera.add("z");

        nizKaraktera.add("A");
        nizKaraktera.add("B");
        nizKaraktera.add("C");
        nizKaraktera.add("D");
        nizKaraktera.add("E");
        nizKaraktera.add("F");
        nizKaraktera.add("G");
        nizKaraktera.add("H");
        nizKaraktera.add("I");
        nizKaraktera.add("J");
        nizKaraktera.add("K");
        nizKaraktera.add("L");
        nizKaraktera.add("M");
        nizKaraktera.add("N");
        nizKaraktera.add("O");
        nizKaraktera.add("P");
        nizKaraktera.add("Q");
        nizKaraktera.add("R");
        nizKaraktera.add("S");
        nizKaraktera.add("T");
        nizKaraktera.add("U");
        nizKaraktera.add("V");
        nizKaraktera.add("W");
        nizKaraktera.add("X");
        nizKaraktera.add("Y");
        nizKaraktera.add("Z");

        nizKaraktera.add("0");
        nizKaraktera.add("1");
        nizKaraktera.add("2");
        nizKaraktera.add("3");
        nizKaraktera.add("4");
        nizKaraktera.add("5");
        nizKaraktera.add("6");
        nizKaraktera.add("7");
        nizKaraktera.add("8");
        nizKaraktera.add("9");

        int randomBroj = random.nextInt(nizKaraktera.size());

        String slovo = nizKaraktera.get(randomBroj);

        return slovo;
    }

    public static String generisiRandomSpecijalanKarakter() {
        ArrayList<String> specijalniKarakter = new ArrayList<>();
        Random random = new Random();
        specijalniKarakter.add("@");
        specijalniKarakter.add("#");
        specijalniKarakter.add("&");
        specijalniKarakter.add("*");
        specijalniKarakter.add("!");

        int randombroj = random.nextInt(specijalniKarakter.size());
        String element = specijalniKarakter.get(randombroj);
     return element;

    }
}
