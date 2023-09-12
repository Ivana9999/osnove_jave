package d_11_09_2023.Zadatak1;

public class Zadatak1 {
//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)
//
//    Kreirati klasu Knjiga koji ima:
//            -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.


    public static void main(String[] args) {

        Autor autor1 = new Autor ("David" , "Albahari" );
        autor1.stampaj();


        Autor autor2 = new Autor("John", "Tolkin");
        autor2.stampaj();




        Knjiga knjiga1 = new Knjiga(329845568, "Meditacije", 2019, autor1 );
     knjiga1.stampaj();

        Knjiga knjiga2 = new Knjiga(40573957, "Hobbit" , 2001, autor2);
        knjiga2.stampaj();
    }
}
