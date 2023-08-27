package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

//    Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 4
//    Unesite broj: 7
//    Unesite broj: 8
//    U nizu ima 2 parna broja.

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            numbers.add(broj);
        }
        int brojParnihBrojeva = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                brojParnihBrojeva++;
            }
        }
        System.out.println("U nizu ima " + brojParnihBrojeva + " parna broja. ");

















    }
}
