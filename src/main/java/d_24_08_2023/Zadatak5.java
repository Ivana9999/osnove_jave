package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

// Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 7
//    Unesite broj: 3
//    Unesite broj: 9
//    Unesite X: 3
//
//    Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

    public static void main(String[] args) {

        ArrayList<Integer> nizA = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
        }
        System.out.print("Unesite X: ");
        int x = s.nextInt();
        ArrayList<Integer> indeksi = new ArrayList<>();

        for (int i = 0; i < nizA.size(); i++) {
         if (nizA.get(i) == x) {
             indeksi.add(i);
         }
        }
        System.out.println("Elementi niza A koji su jednaki broju X imaju indekse: " + indeksi);


















    }
}
