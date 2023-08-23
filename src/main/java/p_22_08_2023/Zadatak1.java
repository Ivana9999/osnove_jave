package p_22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int broj = 0;

        while (broj < 10 || broj  >50) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            System.out.println("Greska: broj nije u opsegu od 10 do 50: ");

        }
        System.out.println("KRAJ");

    }
}

