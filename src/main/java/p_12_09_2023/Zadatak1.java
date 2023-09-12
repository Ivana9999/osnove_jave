package p_12_09_2023;

public class Zadatak1 {
//    Kreirati klasu Proizvod koja ima
//    Naziv proizvoda
//    kupca/musteriju
//    cenu izrade proizvoda
//    gettere i settere
//            konstruktore
//    Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//    cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//    Metodu za stampanje proizvoda u formatu:
//    naziv proizvoda - cena
//    ime i prezime - broj kartice
//
//    Kreirati klasu Kupac koja ima:
//    ime i prezime
//    clansku kartu
//    gettere i settere, clanska karta ne moze da se menja
//            konstruktore
//    metodu stampaj koja stampa u formatu
//    ime i prezime - broj kartice
//
//    Kreirati klasu ClanskaKarta koja ima:
//    popust (u rasponu od 5 do 10 %)
//    broj kartice (npr: 9329-0239)
//    gettere i setter
//            konstuktore
//
//
//    U glavnom programu kreirati objekte i isprobati funkcionalnosti.

    public static void main(String[] args) {

       ClanskaKarta clanskaKarta1 = new ClanskaKarta(6, 957-486);
       ClanskaKarta clanskaKarta2 = new ClanskaKarta(8, 3973-863);


       Kupac kupac1 = new Kupac("Pera Peric" , clanskaKarta1);
       Kupac kupac2 = new Kupac("Jovan Jovanovic" , clanskaKarta2);

       kupac1.stampaj();
       kupac2.stampaj();

Proizvod proizvod1 = new Proizvod("Patike" , 102.0,kupac1 );
Proizvod proizvod2 = new Proizvod("Auto" , 2947.0 , kupac2);

proizvod1.stampaj();
proizvod2.stampaj();




    }
}
