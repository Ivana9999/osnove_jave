package p_18_09_2023.Zadatak1;

public class Zadatak1 {
//    Kreirati apstraktnu klasu Student koja ima:
//    ime i prezime studenta
//    broj indeksa
//    godinu studija
//    gettere, settere i konstruktore
//    apstraktnu metodu koja vraca cenu skolarine.
//    apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//    metodu koja stampa podatke u formatu:
//    ime i prezime, broj indeksa, godina studija
//    Finansiranje: budzet/samofinansirajuci
//    Cena skolarine: cena
//    Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 90000
//    za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//    Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//    U glavnoj klasi kreirati studente i testirati funkciolanosti
    public static void main(String[] args) {

Student student1 = new StudentOsnovnih("Marko Markovic", 55, 3);
student1.stampaj();


Student student2 = new StudentMaster("Darko Darkovic", 123, 5);
student2.stampaj();
    }
}
