package d_18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x: ");
        int x = s.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.println(x + " x " + i + " = " + (i * x));

        }




    }
}
