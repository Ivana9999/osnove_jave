package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
//    Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: -4
//    Unesite broj: 3
//    Unesite broj: -7
//    Unesite broj: 9


    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<>();
        ArrayList<Integer> pozitivniBrojevi = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
            if( broj > 0) {
                pozitivniBrojevi.add(broj);
            }
        }
        System.out.println("Brojevi veci od nule u nizu A su : " + pozitivniBrojevi);
    }
}
