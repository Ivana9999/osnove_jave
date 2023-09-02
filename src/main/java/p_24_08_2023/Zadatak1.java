package p_24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.
//    public static void main(String[] args)
   {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int suma = numbers.get(0) + numbers.get(numbers.size() - 1);
        System.out.println("Suma nultog i zadnjeg elementa: " + suma);


















    }
}
