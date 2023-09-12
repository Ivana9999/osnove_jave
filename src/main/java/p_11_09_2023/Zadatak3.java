package p_11_09_2023;

public class Zadatak3 {
//    Kreirati klasu Film koja ima:
//    naziv filma
//    iz koje godine je film
//            reziser
//    konstruktore, gettere i settere
//    getter i setter za rezisera
//    metodu print koja stampa podatke u formatu
//    naziv filma, godina
//    Rezirao ga: ime i prezime rezisera, starost
//
//
//    Kreirati klasu Reziser koja ima:
//    ime i prezime rezisera
//    starost
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    ime prezime, starost.god
//
//    U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
//    Napravite vezu izmedju objekata i pozovite metode.

    public static void main(String[] args) {

        Reziser reziser = new Reziser("Marko Markovic ", 35);
        Film film = new Film("Lord Of The Rings ",  2001, reziser);
        film.stampaj();
        film.setNazivFilma("Nemoguca misija ");
        film.setGodinaFilma(2005);
        System.out.println(film.getNazivFilma() + film.getGodinaFilma());
        film.stampaj();


        Reziser reziser2 = new Reziser("Peter Jackson", 55);
        reziser2.stampaj();
        reziser2.setImeIPrezime("Tom Cruise ");
        reziser2.setStarost(50);
        System.out.println(reziser2.getImeIPrezime() + reziser2.getStarost());
        reziser2.stampaj();



    }
}
