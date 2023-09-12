package d_12_09_2023.Zadatak1;

public class Zadatak1 {
//    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//    ime i prezime
//    broj licne karte
//            jmbg
//    podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//    konstuktore
//    gettere i settere, jmbg ne sme da se menja
//    metodu stampaj, koja stmpa podatke u formatu:
//    ime i prezime, broj licne karte
//
//    Kreirati klasu Ugovor koja ima:
//    godinu, dan i mesec sklapanja ugovora
//    osobu koja prodaje nekretninu (fizicko lice)
//    osobu koja kupuje nekretninu (fizicko lice)
//    cenu za koju se prodaje nekretnina
//    adresu nekretnine (ulica br., grad)
//    metodu koja vraca procenat zarade
//    za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//    metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//            1000 + cena za koju se prodaje * procenat zarade
//    metodu koja stampa ugovor u formatu:

    public static void main(String[] args) {

        FizickoLice prodavac = new FizickoLice("Pera Peric", 3294384, 8957493, true );
        FizickoLice kupac = new FizickoLice("Marko Markovic" ,305748, 3094898, false);




        Ugovor ugovor1 = new Ugovor(2019, 10, 8, prodavac, kupac, 92673.0, "Papa Pavla");


        double procenatZarade = ugovor1.procenatZarade();
        double zaradaAgencije = ugovor1.zaradaAgencije(procenatZarade);

        ugovor1.stampaj(zaradaAgencije);


    }
}
