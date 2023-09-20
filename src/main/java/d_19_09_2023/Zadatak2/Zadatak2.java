package d_19_09_2023.Zadatak2;

public class Zadatak2 {
//    Zadatak (za vezbanje)
//(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima:
//    ime planine
//    naziv države u kojoj se nalazi
//    visinu planine.
//    a od javnih metoda:
//    default-ni konstruktor i konstuktor koji postavlja sve parametre
//    gettere i settere za sve atribute
//    (15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima:
//    jedinstveni celobrojni identifikacioni broj
//    ime i prezime
//    Dok od javnih metoda:
//    konstruktor koji postavlja sve atribute klase.
//    gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//    apstraktnu metodu štampaj
//    apstraktnu metodu koja vraca clanarinu planinara
//    apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.
//    (20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//    težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//    naziv okruga odakle je rekreativni planinar.
//    maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//    da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//    rekeativci placaju clanarinu u iznosu od 1000 rsd
//    metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//    Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
//    (20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//    Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
//     (25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute:
//    naziv doma
//    godinu kada je osnovan.
//    članove doma koji su planinari (klasa vodi računa o nizu)
//    Dok od javnih:
//    default-ni konstuktor i konstuktor koji postavlja sve parametre
//    gettere i settere koji su potrebni
//    metodu učlani planinara, koja dodaje planinara u niz
//    metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//    metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//    metodu koja štampa podatke o domu i o svim članovima doma
//    metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//  (10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
//  Napomena​: Za funkcionalnost koju ne znate da uradite, izostavite njenu implementaciju i smatrajte da je ona implementirana.

    public static void main(String[] args) {

        PlaninarskiDom dom = new PlaninarskiDom("Bor", 1999);

        RekreativniPlaninar planinar1 = new RekreativniPlaninar(15, "Marko markovic", 76, "srem", 2000.0 );
        RekreativniPlaninar planinar2 = new RekreativniPlaninar(10, "Sima Simic", 60, "backa", 1000.0 );
        RekreativniPlaninar planinar3 = new RekreativniPlaninar(15, "Pera Peric", 97, "banat", 1500.0 );

        Alpinista alpinista1 = new Alpinista(26, "Darko Darkovic", 473);
        Alpinista alpinista2 = new Alpinista(545, "Jovana Jovanovic", 202);
        Alpinista alpinista3 = new Alpinista(42, "Petar Petrovic", 100);

        dom.uclaniPlaninara(planinar1);
        dom.uclaniPlaninara(planinar2);
        dom.uclaniPlaninara(planinar3);
        dom.uclaniPlaninara(alpinista1);
        dom.uclaniPlaninara(alpinista2);
        dom.uclaniPlaninara(alpinista3);
        dom.stampaj();
    }
}
