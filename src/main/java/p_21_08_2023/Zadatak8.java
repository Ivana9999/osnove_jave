package p_21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        int broj1;
        int broj2;
        int broj3;
        int broj4;
        int broj5;

        for (int i = 0; i < 5; i++) {
            int broj = n % 10;
            System.out.print(broj + " , ");
            n = n / 10;
        }


















    }
}
