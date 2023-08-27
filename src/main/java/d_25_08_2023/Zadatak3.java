package d_25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.



        stampajPodatke(123123,"Ivana", "Ivkov", 1999, true);

    }

    public static void stampajPodatke(int JMBG, String ime, String prezime, int godinaRodjenja, boolean activan) {

        System.out.println("JMBG: " + JMBG);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + activan);

    }
}
