package p_15_09_2023;

public class Zadatak1 {
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//    jmbg
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//    Napisati metod stampajStudenta da stampa sve podatke o studentu
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru
//    U glavnom programu kreirati 2 studenta i 2 profesora.
//    Prilagodite konstuktore
//    Overide-tujte metodu za stampu iz osnovne klase
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setImeIPrezime("Ivana Ivkov");
        student1.setJmbg(3938229);
        student1.uplatiZaSkolarinu(5000);
        student1.stampaj();


        Student student2 = new Student();
        student2.setImeIPrezime("Marko Markovic");
        student2.setJmbg(3938229);
        student2.uplatiZaSkolarinu(5000);
        student2.stampaj();




        Profesor profesor1 = new Profesor();
        profesor1.setImeIPrezime("Pera Peric");
        profesor1.setJmbg(89372);
        profesor1.stampaj();


        Profesor profesor2 = new Profesor();
        profesor2.setImeIPrezime("Darko Darkovic");
        profesor2.setJmbg(893452);
        profesor2.stampaj();

    }
}
