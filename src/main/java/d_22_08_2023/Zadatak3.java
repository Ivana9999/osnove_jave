package d_22_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        String  rimBrojevi = " ";


        while(!rimBrojevi.equals("KRAJ")) {
            System.out.println("Unesite rimski broj: ");
            rimBrojevi = s.next();

            if (rimBrojevi.equals("I")) {
                System.out.println("Arapski: 1");
            } else if (rimBrojevi.equals("V")) {
                    System.out.println("Arapski: 5");
            } else if ( rimBrojevi.equals("X")) {
                System.out.println("Arapski: 10");
            } else if ( rimBrojevi.equals("L")) {
                System.out.println("Arapski: 50");
            } else if ( rimBrojevi.equals("C")) {
                System.out.println("Arapski: 100");
            } else if ( rimBrojevi.equals("D")) {
                System.out.println("Arapski: 500");
            } else if ( rimBrojevi.equals("M")) {
                System.out.println("Arapski: 1000");
            }
            }

        System.out.println("Kraj programa.");













            }
}
