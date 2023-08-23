package p_21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
       int n = s.nextInt();
       int counter = 0;

       for( int i = 0; i < n; i++) {
           System.out.print("Uneti broj: ");
           int broj = s.nextInt();

           if (broj % 2 == 0) {
               counter = counter + 1;
           }
       }
        System.out.println("Uneto je: " + counter +  " parna broja.");














    }
}
