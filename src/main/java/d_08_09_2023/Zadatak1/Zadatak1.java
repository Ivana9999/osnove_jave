package d_08_09_2023.Zadatak1;

public class Zadatak1 {
//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//    za tezinu do 100g, postarina iznosi 200din
//    za tezinu od 101g do 500g, postarina iznosi 400din
//    za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();

        proizvod1.nazivProizvoda = "Patike";
        proizvod1.cenaProizvoda = 5600.0;
        proizvod1.tezinaProizvoda = 1000.0;



        Proizvod proizvod2 = new Proizvod();

        proizvod2.nazivProizvoda = "Telefon";
        proizvod2.cenaProizvoda = 120000.0;
        proizvod2.tezinaProizvoda = 150.0;


        proizvod1.stampaj();
        System.out.println("Postarina za ovaj proizvod je: " + proizvod1.racunajPostarinu());
        System.out.println("Cena sa popustom je: " + proizvod1.vratiCenuSaPopustom(30));
        proizvod1.povecajCenu(400.0);
        proizvod1.stampaj();




        proizvod2.stampaj();
        System.out.println("Postarina za ovaj proizvod je: " + proizvod2.racunajPostarinu());
        System.out.println("Cena sa popustom je: " + proizvod2.vratiCenuSaPopustom(30));
        proizvod2.povecajCenu(400.0);
        proizvod2.stampaj();




    }
}
