package d_12_09_2023.Zadatak3;

public class Zadatak3 {
//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//    metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//    metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.
//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere konstruktore
//    metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da
//    metoda prima parametar koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju
//    racunajte fiksnu proviziju u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//    Kao parametar funkcije se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//    a na drugi racun dodaje samo (trazena suma).
//    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna
//    Naravno u glavnom kreirati objekte i testirati funkcionalnosti
    public static void main(String[] args) {

        Racun racun = new Racun("9374932-3893-3832 ", " Jovan Jovanovic ", 1220);
        racun.uplatiNaRacun(850.0);
        racun.skiniSaRacuna(250.0);
        racun.stampaj();

        Racun racun1 = new Racun("012819-21937-2321 " , " Petar Petrovic ", 1200);
        racun1.uplatiNaRacun(2332);
        racun1.skiniSaRacuna(233);


        Transakcija transakcija = new Transakcija (124436, racun, racun1 );

        racun.stampaj();
        racun1.stampaj();

        transakcija.izvrsiTransakciju(200);
        racun.stampaj();
        racun1.stampaj();
        transakcija.stampaj();
















    }
}
