package d_17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x za T1: ");
        int xT1 = s.nextInt();
        System.out.print("Unesite y za T1: ");
        int yT1 = s.nextInt();

        System.out.print("Unesite x za T2: ");
        int xT2 = s.nextInt();
        System.out.print("Unesite y za T2: ");
        int yT2 = s.nextInt();

        System.out.print("Unesite x za M: ");
        int xM = s.nextInt();
        System.out.print("Unesite y za M: ");
        int yM = s.nextInt();

        if (xT1 <= xM && xM <= xT2 && yT2 <= yM && yM <= yT1) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto unutar forme");
        }
















        }
}
