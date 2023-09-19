package d_19_09_2023.Zadatak1;

import p_19_09_2023.Zadatak1.Kuca;

public class Zadatak1 {
    //    Kreirati abstraktnu klasu Ambalaza koja ima:
//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//    abstraktnu metodu koja vraca cenu artikla
//    abstraktnu metodu stampa
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.
//    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//    (broj kartice), (ime i prezime)
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//    U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
    public static void main(String[] args) {

        Korpa korpa = new Korpa("23132-23453", "Mleko", 70.0, 80.0);

        Tetrapak tetrapak1 = new Tetrapak(true, 445.0 );
        Tetrapak tetrapak2 = new Tetrapak(false, 500.0 );
        StaklenaAmbalaza ambalaza = new StaklenaAmbalaza("42324-454787", "Jaja", 80.0, 60.0, 294.0, true, 1000.0);

        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(ambalaza);


     SuperKartica kartica = new SuperKartica("045843-4325", "biber", 200.0, 100.0, 500, "Marko Markovic", 20);

        System.out.println(korpa.ukupnaCena(kartica));


    }
}