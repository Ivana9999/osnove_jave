package p_24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
// Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//        Npr: 1,4,5,6,7 => 1,4,5,60,8
//    int a = 10;
//    a = a * 10;


    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        int pozicija = numbers.get(3) * 10;
       numbers.set(3, pozicija);
        System.out.println(" Rezultujuci niz: " + numbers);













    }
}
