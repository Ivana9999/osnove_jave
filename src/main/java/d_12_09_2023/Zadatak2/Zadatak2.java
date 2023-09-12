package d_12_09_2023.Zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//    Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//            (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

    public static void main(String[] args) {
        ArrayList <ZeleniKarton> zeleniKarton = new ArrayList<>();


        zeleniKarton.add(new ZeleniKarton("Stefan Stefanovic", 55, "Hemija" , "Mirko Mirkovic", 6));
        zeleniKarton.add(new ZeleniKarton("Sima Simic", 23, "Biologija" , "Ljuba Ljubic", 5));
        zeleniKarton.add(new ZeleniKarton("Petar Petrovic", 654, "Matematika" , "Cvetic Cvetanovic", 10));
        zeleniKarton.add(new ZeleniKarton("Darko Darkovic", 24, "Psihologija" , "Pavle Pavlovic", 8));
        zeleniKarton.add(new ZeleniKarton("Dijana Mionovic", 134, "Fiziologija" , "Misko Miskovic", 7));

        int sumaOcene = 0;
        for (int i= 0; i < zeleniKarton.size(); i ++) {
            if (zeleniKarton.get(i).daliJePolozenIspit()) {
                sumaOcene = sumaOcene + zeleniKarton.get(i).getOcena();
            }
            zeleniKarton.get(i).stampaj();
        }


        double prosek = sumaOcene / 5.0;
        System.out.println( "Prosek: " + prosek);


    }
}
