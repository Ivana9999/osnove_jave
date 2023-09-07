package VezbanjeTest;

public class Zadatak4 {
    //    Zadatak (Metode)
//    Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//    prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju i vraca
//    konvertovanu vrednost.
//    Podsetnik za konverziju jedinica:
//            1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//    Primer poziva metode
//    Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//    Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//    U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati
//    odgovarajuce poruke na ekranu.
//    Primer izvrsenja programa:
//            3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km
    public static void main(String[] args) {

        double centimetri = konverzijaMetara(3.5, "cm");
        System.out.println("3.5m je " + centimetri + "cm");
        double decimetri = konverzijaMetara(3.5,  "dm");
        System.out.println("3.5 je " + decimetri + "dm");
        double kilometri = konverzijaMetara(3.5, "km");
        System.out.println("3.5 je " + kilometri + "km");
     
    }

    public static double konverzijaMetara(double metar, String jedinica) {


        if (jedinica.equals("cm")) {
            return metar * 100;
        } else if (jedinica.equals("dm")) {
            return metar * 10;
        } else if (jedinica.equals("km")) {
            return metar * 0.001;
        } else {
            return 0.0;
        }
    }
}





