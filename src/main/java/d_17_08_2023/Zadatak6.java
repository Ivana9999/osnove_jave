package d_17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

        System.out.println("Unesite d: ");
        int d = s.nextInt();

        String p = "#";

        if (a < 0) {
            p= a + " " + p;
        } else {
           p= p + " " + a;
        }

        if (b < 0) {
            p= b + " " + p;
        } else {
            p= p + " " + b;
        }

        if (c < 0) {
            p= c + " " + p;
        } else {
            p= p + " " + c;
        }

        if (d < 0) {
            p= d + " " + p;
        } else {
            p= p + " " + d;
        }

        System.out.println("String p ima vrednost = : " + p);








    }
}
