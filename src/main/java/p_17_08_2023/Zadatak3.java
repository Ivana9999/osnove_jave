package p_17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

        System.out.println("Prvi broj: ");
        double a = s.nextDouble();

        System.out.println("Drugi broj: ");
        double b = s.nextDouble();

        System.out.println("Treci broj: ");
        double c = s.nextDouble();

        double srednjaVrednost = (a + b + c) / 3;
        System.out.println("Srednja vrednost: " + srednjaVrednost);






    }
}
