package d_07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Vichy krema za lice";
        proizvod1.cena = 4250.3;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Maslinovo ulje";
        proizvod2.cena = 1100.5;

        Proizvod proizvod3 = new Proizvod();
        proizvod2.naziv = "Sampon za kosu";
        proizvod3.cena = 3500.0;


        System.out.println("Naziv proizvoda: " + proizvod1.naziv + " Cena proizvoda: " + proizvod1.cena + " dinara.");
        System.out.println("Naziv proizvoda: " + proizvod2.naziv + " Cena proizvoda: " + proizvod2.cena + " dinara.");
        System.out.println("Naziv proizvoda: " + proizvod3.naziv + " Cena proizvoda: " + proizvod3.cena + " dinara.");
    }
}