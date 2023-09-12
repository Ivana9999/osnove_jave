package Prvi_Test_Java;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
//    Napišite program koji simulira popularnu igricu "Veće-Manje".
//    Cilj igre je da korisnik pogodi tajni broj u što manje pokušaja.
//    Program će automatski izabrati nasumičan broj u opsegu od 1 do 50,
//    a korisniku će biti dozvoljeno da pokuša da pogodi taj broj najviše 5 puta.
//    Nakon svakog pokušaja, korisnik će dobiti povratnu informaciju da li je uneti broj manji ili
//    veći od tajnog broja. Igra će trajati sve dok korisnik ne pogodi tajni broj ili dok ne
//    iskoristi sve pokušaje.
//    Evo primera izvršenja programa za oba scenarija, prema vašem opisu:
//
//    Primer izvršenja kada je tajni broj 37:
//    Tajni broj je spreman, pokušajte da pogodite broj.
//    Unesite broj: 5
//    Tajni broj je veći.
//    Unesite broj: 20
//    Tajni broj je veći.
//    Unesite broj: 35
//    Tajni broj je veći.
//    Unesite broj: 37
//    Čestitamo, pogodili ste tajni broj!
//
//
//    Primer izvršenja kada je tajni broj 37, ali igrač nije uspeo da ga pogodi u 5 pokušaja:
//    Tajni broj je spreman, pokušajte da pogodite broj.
//    Unesite broj: 5
//    Tajni broj je veći.
//    Unesite broj: 20
//    Tajni broj je veći.
//    Unesite broj: 35
//    Tajni broj je veći.
//    Unesite broj: 48
//    Tajni broj je manji.
//    Unesite broj: 40
//    Tajni broj je manji.
//
//    Kraj igre! Niste pogodili tajni broj u 5 pokušaja.

    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Tajni broj je spreman, pokušajte da pogodite broj.");

        int broj = random.nextInt(50);

        int unetBroj = 0;
        int brojPokusaja = 0;

        while (unetBroj != broj && brojPokusaja < 5) {
            System.out.print("Unesite broj: ");
            unetBroj = s.nextInt();
            brojPokusaja = brojPokusaja + 1;



            if(unetBroj == broj) {
                System.out.print("Čestitamo, pogodili ste tajni broj!");
            }

                if(unetBroj < broj) {
                System.out.println("Tajni broj je veci.");
            }
                if(unetBroj > broj) {
                    System.out.println("Tajni broj je manji.");
                }

                if (brojPokusaja == 5) {
                    System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");
            }




        }


    }
}
