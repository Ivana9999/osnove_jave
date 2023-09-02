package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {


//. (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//    a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//    Unesite N: 6
//    Unesite broj: 1
//    Unesite broj: 5
//    Unesite broj: 2
//    Unesite broj: 7
//    Unesite broj: 8
//    Unesite broj: -1
//
//    Niz a: 1, 5, 2, 7, 8, -1
//    Niz b: 1, 5, 2, 1, 1, 1


        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        ArrayList<Integer> nizA = new ArrayList<>();
        ArrayList <Integer> nizB = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
          nizA.add(broj);
          if(i < 3) {
              nizB.add(broj);
          } else {
              nizB.add(1);
          }
        }
        System.out.println(nizA);
        System.out.println(nizB);





    }

}