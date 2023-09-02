package p_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//    Primer: Ako je niz 1,2,4,5,7
//    Stampa se, suma = 19

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int suma = 0;

    for (int  i = 0; i < numbers.size(); i++) {
        int x = numbers.get(i);
        suma = suma + x;
        }
        System.out.println("Suma je " + suma);


















    }
}
