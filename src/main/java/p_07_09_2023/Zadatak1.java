package p_07_09_2023;

import java.util.Scanner;

public class Zadatak1 {

//    		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//	U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//    Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//    Primer izvrsenja:
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//    Primalac: Marko Markovic, 840-23932-334, stanje: 200
//    Unesite sumu za transakciju: 500
//    Stanje nakon stransakcije
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//    Primalac: Marko Markovic, 840-23932-334, stanje: 700

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun prvi = new Racun();
        prvi.ime = "Ivana";
         prvi.prezime = "Ivkov";
        prvi.stanjeNaRacunu = 2197.0;

        Racun drugi = new Racun();

        drugi.ime= "Nikola";
        drugi.prezime = "Nikolic";
        drugi.stanjeNaRacunu = 1827.5;

        System.out.println("Posljalac: " + prvi.ime + " , " + prvi.prezime + " , " + "stanje: " + prvi.stanjeNaRacunu);
        System.out.println("Posljalac: " + drugi.ime + " , " + drugi.prezime + " , " + "stanje: " + drugi.stanjeNaRacunu);

        System.out.println("Unesite sumu za transakciju: ");
        double tranzakcija = s.nextInt();

        prvi.stanjeNaRacunu = prvi.stanjeNaRacunu - tranzakcija;
        drugi.stanjeNaRacunu = drugi.stanjeNaRacunu + tranzakcija;

        System.out.println("Stanje nakon transakcije: ");

        System.out.println("Posljalac: " + prvi.ime + " , " + prvi.prezime + " , " + "stanje: " + prvi.stanjeNaRacunu);
        System.out.println("Posljalac: " + drugi.ime + " , " + drugi.prezime + " , " + "stanje: " + drugi.stanjeNaRacunu);




    }
}
