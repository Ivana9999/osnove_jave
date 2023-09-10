package d_08_09_2023.Zadatak2;

public class Zadatak2 {
//    .Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
//    Od metoda:
//    like(), koja povecava broj lajkova za 1.
//    dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.



    public static void main(String[] args) {


        FacebookPost post1 = new FacebookPost();

        post1.imeIPrezimeKorisnikaObjavaPosta = "Pera Peric";
        post1.imeIPrezimeKorisnikaNaKomJeObjavljenPost = "Sima Simic";
        post1.tekstObjave = "Ovo je tekst objave";
        post1.brojLajkova = 4576;
        post1.brojDeljenja = 125;

        post1.stampaj();
        post1.like();
        post1.dislike();
        post1.share();
        post1.like();
        post1.stampaj();




        FacebookPost post2 = new FacebookPost();

        post2.imeIPrezimeKorisnikaObjavaPosta = "Marko Markovic";
        post2.imeIPrezimeKorisnikaNaKomJeObjavljenPost = "Lazar Lazarevic";
        post2.tekstObjave = "Ovo je tekst objave";
        post2.brojLajkova = 4576;
        post2.brojDeljenja = 125;

        post2.stampaj();
        post2.like();
        post2.dislike();
        post2.share();
        post2.like();
        post2.stampaj();









    }
}
