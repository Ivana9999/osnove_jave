package Prvi_Test_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
//    Napišite program koji vrši validaciju udaljenosti između dalekovoda kako bi se utvrdilo
//    da li udaljenosti ispunjavaju propisane standarde Evropske unije.
//
//    Korisnik unosi udaljenosti između dalekovoda, a te informacije program smešta u niz brojeva.
//    Korisnik unosi N udaljenosti dalekovoda, gde je N unos korisnika.
//
//    Nakon unosa udaljenosti, program će prikazati grafički prikaz
//    udaljenosti između svaka dva dalekovoda. Zatim, program proverava da li rastojanje između
//    dva dalekovoda ispunjava standarde, pri čemu standardi za udaljenosti između dalekovoda važe
//    ako su udaljenosti unutar opsega od 50 do 100 metara.
//    Ukoliko neka udaljenost ne ispunjava ove standarde, korisniku će se prikazati poruka o
//    neispravnoj udaljenosti.
//
//    Na kraju izvršenja programa, program će izračunati ukupnu dužinu kablova potrebnu za
//    celu dalekovodnu infrastrukturu. Dužina kabla između dva dalekovoda iznosi 1.5 puta udaljenost
//    između dalekovoda.
//
//    Primer izvršenja:
//    Unesite N: 5
//    Unesite rastojanje: 60
//    Unesite rastojanje: 66
//    Unesite rastojanje: 55
//    Unesite rastojanje: 105
//    Unesite rastojanje: 35
//
//            | …60m… | … 66m… | …55m… | …105m… | …35m… |
//
//    Rastojanje na poziciji 3, dužine 105m nije po standardima Evropske unije.
//    Rastojanje na poziciji 4, dužine 35m nije po standardima Evropske unije.
//
//    Potrebna dužina kablova za dalekovodnu infrastrukturu je 481.5m.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            System.out.print("Unesite rastojanje: ");
            int rastojanje = s.nextInt();
            numbers.add(rastojanje);

        }

        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(" ..."+ numbers.get(i)+ "m... |");
        }

        System.out.println("");

        for (int i =0;i< numbers.size(); i++) {


            if(numbers.get(i) < 50) {
                System.out.println("Rastojanje na poziciji " +  i + ", " + "dužine " + numbers.get(i) + "m nije po standardima Evropske unije.");
            }
            if(numbers.get(i) > 100) {
                System.out.println("Rastojanje na poziciji " +  i + ", " + "dužine " + numbers.get(i) + "m nije po standardima Evropske unije.");
            }

        }
    double duzinaKable = 0.0;
        for(int i = 0; i< numbers.size(); i++) {
            duzinaKable = duzinaKable + numbers.get(i) * 1.5;
        }

        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + duzinaKable + "m.");

    }
}
