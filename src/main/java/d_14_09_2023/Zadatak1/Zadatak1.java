package d_14_09_2023.Zadatak1;

public class Zadatak1 {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)
    public static void main(String[] args) {

Student student = new Student(55, "Marko Markovic ", "master");


Ispit ispit = new Ispit("matematika ", 6.5, "Darko Darkovic" );
Ispit ispit2 = new Ispit("fizika ", 8.0, "Milan Milanovic" );
Ispit ispit3 = new Ispit("hemija ", 4.5, "Jovana Jovanovic" );

student.dodajIspit(ispit);
student.dodajIspit(ispit2);
student.dodajIspit(ispit3);

student.stampaj();





    }
}
