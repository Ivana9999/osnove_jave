package p_18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj a: ");
        int a = s.nextInt();

        if (a % 2 == 0 ) {
            System.out.println("Broj je deljiv sa 2.");
        }

        if (a % 3 == 0) {
            System.out.println("Broj je deljiv sa 3.");
        }

    }
}
