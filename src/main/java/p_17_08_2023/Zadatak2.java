package p_17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
   public static void main(String[] args) {

Scanner s = new Scanner(System.in);

        System.out.println("Uneti dan: ");
        int dan = s.nextInt();

        System.out.println("Uneti mesec: ");
         int mesec = s.nextInt();

        System.out.println("Unteti godinu: ");
        int godina = s.nextInt();

        String datum = dan + "-" + mesec +  "-" + godina;
        System.out.println("Datum: " + datum);
    }
}
