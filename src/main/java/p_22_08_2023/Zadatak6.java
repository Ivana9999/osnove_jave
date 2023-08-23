package p_22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String ruzneReci = " ";

        while (!ruzneReci.contains(".")) {
            System.out.print("Unesite rec: ");
            ruzneReci = s.next();

            if (ruzneReci.equals("zajebavas"))
                System.out.println("beeeeeeeeeeeeep");

           else if (ruzneReci.equals("mars")) {
                System.out.println("beeeeeeeeeeeep");
            }
            else if (ruzneReci.equals("stoko")) {
                System.out.println("beeeeeeeeeeeep");
            }
           else if (ruzneReci.equals("svinjo")) {
                System.out.println("beeeeeeeeeeeep");

            } else {
                System.out.println(ruzneReci);
            }
        }
           System.out.println("Kraj programa.");















    }
}
