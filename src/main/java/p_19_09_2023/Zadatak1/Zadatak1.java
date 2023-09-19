package p_19_09_2023.Zadatak1;

public class Zadatak1 {
//    Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
//    adresa (ulica i broj)
//    povrsina objekta
//    zona (1, 2 ili 3)
//    konstuktore, gettere i settere
//    metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//    zona 1, koeficijent je 1.4
//    zona 2, koeficijent je 1.1
//    zona 3, koeficijent je 1.05
//    abstraktnu metodu koja racuna i vraca porez objekta
//    abstraktnu metodu stampaj
//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//    metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//    metodu koja vraca objekat sa najmanjim porezom
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte
//    U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.
    public static void main(String[] args) {

  PoreskaUprava uprava = new PoreskaUprava("Novi Sad");

  Kuca kuca = new Kuca("Toplice Milana", 200.0, 2, 23);
  Zgrada zgrada1 = new Zgrada("Kraljevica Marka", 245.0, 1, 20);
  Zgrada zgrada2 = new Zgrada("Jovana Jovanovica", 105.0, 3, 70);
  Lokal lokal = new Lokal("Radakova", 136.0, 5);
  Kuca kuca1 = new Kuca("Zmaj Jovina", 70.0, 1, 60);


  uprava.dodajObjekat(kuca);
  uprava.dodajObjekat(zgrada1);
  uprava.dodajObjekat(zgrada2);
  uprava.dodajObjekat(lokal);
  uprava.dodajObjekat(kuca1);

uprava.stampajSveObjekte();


    }
}
