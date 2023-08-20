package d_18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju table: ");
         int x = s.nextInt();
         String redTabele = "";

         for (int i = 0; i<x; i++ ) {
            redTabele = redTabele + "_|";
         }

         for (int i = 0; i <x; i++) {
             System.out.println(redTabele);
         }




    }
}
