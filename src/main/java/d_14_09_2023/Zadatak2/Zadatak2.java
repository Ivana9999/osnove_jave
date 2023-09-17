package d_14_09_2023.Zadatak2;

public class Zadatak2 {
//    Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//    Za potrebe Lotto igre na srecu potrebno je
//    Kreirati klasu Kombinacija koja ima:
//    id kombinacije (String)
//    niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//    konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//    gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//    metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//    Zaglavlje metode je:
//    public boolean daLiJeIstaKombinacija( Kombinacija k)
//    metoda vraca true ako su svi elementi na istim pozicija isti
//    npr: this [0] == k [0], this [1] == k [1] ….
//    metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//    Kreirati klasu Listic koja ima:
//    niz kombinacija - maksimalno 7 kombinacija
//    metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//    metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//    Zaglavlje metode
//    public boolean dobitna(Kombinacija dobitnaKombinacija)
//    metodu koja stampa listic u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//
//            …… i tako za sve kombinacije
    public static void main(String[] args) {

        Kombinacija kombinacija1 = new Kombinacija("KMB1", 1,2,5,12,24,33,39);

        Kombinacija kombinacija2 = new Kombinacija("KMB2", 2,12,5,12,24,33,39);

        Kombinacija kombinacija3 = new Kombinacija("KMB3", 11,12,5,12,24,35,21);

        Listic listic = new Listic();

        listic.dodajKombinaciju(kombinacija1);
        listic.dodajKombinaciju(kombinacija2);
        listic.dodajKombinaciju(kombinacija3);


        Kombinacija dobitna = new Kombinacija("KMB123123", 1,2,5,12,24,33,39);

        if(listic.dobitna(dobitna)) {
            System.out.println("Imate dobitnu kombinaciju");
        } else {
            System.out.println("Vasa kombinacija nije dobitna");
        }

        listic.stampaj();
    }
}
