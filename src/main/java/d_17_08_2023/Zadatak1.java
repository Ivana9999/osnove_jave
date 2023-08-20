package d_17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Uneti Ime: ");
        String ime = s.next();

        System.out.print("Uneti Prezime: ");
        String prezime = s.next();

        System.out.print("Uneti godinu rodjenja: ");
        int godRodjenja = s.nextInt();

        int godStarosti = 2023 - godRodjenja;
        System.out.println(ime + " " + prezime + " " + "-" + " " + godStarosti + " " + "godina");


    }
}
