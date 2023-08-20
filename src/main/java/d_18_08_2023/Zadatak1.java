package d_18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Unesite x: ");
        int x = s.nextInt();

        int y = 0;


        if (x < 2) {
            y=x;
        } else {
            y=2;
        }

        if(x >= 10) {
            y=x-1;
        }

        System.out.println("y = " + y);


    }
}
