package d_07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

     Oprema oprema1 = new Oprema();

        System.out.println("Unesite tip: " );
       String tip1 = s.next();
        System.out.println("Unesite marku: ");
        String marka1= s.next();
        System.out.println("Unesite cenu: ");
        double cena1 = s.nextDouble();



        oprema1.tip = tip1;
        oprema1.marka = marka1;
        oprema1.cena = cena1;


        Oprema oprema2 = new Oprema();

        System.out.println("Unesite tip: " );
        String tip2 = s.next();
        System.out.println("Unesite marku: ");
        String marka2= s.next();
        System.out.println("Unesite cenu: ");
        double cena2 = s.nextDouble();



        oprema2.tip = tip2;
        oprema2.marka = marka2;
        oprema2.cena = cena2;

        Oprema oprema3 = new Oprema();

        System.out.println("Unesite tip: " );
        String tip3 = s.next();
        System.out.println("Unesite marku: ");
        String marka3= s.next();
        System.out.println("Unesite cenu: ");
        double cena3 = s.nextDouble();



        oprema3.tip = tip3;
        oprema3.marka = marka3;
        oprema3.cena = cena3;

        System.out.println("Tip: " + oprema1.tip + " Marka: " + oprema1.marka + " Cena: " + oprema1.cena);
        System.out.println("Tip: " + oprema2.tip + " Marka: " + oprema2.marka + " Cena: " + oprema2.cena);
        System.out.println("Tip: " + oprema3.tip + " Marka: " + oprema3.marka + " Cena: " + oprema3.cena);








    }
}
