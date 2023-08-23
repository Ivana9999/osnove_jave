package p_22_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String expected = " ";
        String actual = " ";
         int x = 1;
        boolean test = true;

        while (x <= 5 && test) {
            System.out.print("Unesite expected : ");
             expected = s.next();

            System.out.print("Unesite actual:  ");
            actual = s.next();

            if (!expected.equals(actual)) {
                test = false;
            }

            x++;
        }
         if (test) {
             System.out.println("Test passed. ");
         } else {
             System.out.println("Test failed: Expected " + expected + " but god " + actual + "." );
         }














        }
}
