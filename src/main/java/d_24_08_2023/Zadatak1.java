package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

//    Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//    Primer:
//    Unesite pozicjiu od 0 do 9: 3
//    Unesite novu vrednost: 11
//    Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);



        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Unesite pozicijiu od 0 do 9: ");
        int pozicija = s.nextInt();

        System.out.println("Unesite novu vrednost: " );
        int novaVrednost = s.nextInt();
        numbers.set(pozicija, novaVrednost);

        System.out.println(numbers);

















    }
}
