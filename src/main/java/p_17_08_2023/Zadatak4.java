package p_17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

 Scanner s = new Scanner(System.in);

        System.out.println("Uneti a ");
        int a = s.nextInt();

        System.out.println("Uneti b ");
         int b = s.nextInt();

         if (b < a) {
             System.out.println("Broj b je manji od broja a");
         }
}
}