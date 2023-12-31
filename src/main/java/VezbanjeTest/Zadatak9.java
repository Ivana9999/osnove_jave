package VezbanjeTest;

import java.security.SignedObject;
import java.security.interfaces.RSAKey;
import java.util.Scanner;

public class Zadatak9 {
//    Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//    konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//    izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//    U glavnom programu pozvati funkciju za neki od primera.
//    Primer poziva funkcija:
//    Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//    Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//    Primer izvrsenja main programa:
//    Unesite vrednost u eurima: 3
//    Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//    Konverzija eura u druge valute:
//            1 EUR = 117.2113 RSD
//1 EUR = 1.1821 USD
//1 EUR = 89.2323 RUB

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u evrima: ");
      double euri = s.nextDouble();

        System.out.print("Unesite valutu za konverziju: (RSD/USD/RUB): " );
        String valuta = s.next();
double konvertovanaVrednost = konverzija(euri, valuta);

        System.out.println(euri + " EUR = " + konvertovanaVrednost  + " " + valuta);
    }

    public static double konverzija(double eur, String valuta) {
        if (valuta.equals("RSD")) {

            return eur * 117.2113;
        }
        if (valuta.equals("USD")) {
            return eur * 1.1821;
        }
        if (valuta.equals("RUB")) {
            return eur * 89.2323;
        } else {
            return 0.0;
        }

        }
    }