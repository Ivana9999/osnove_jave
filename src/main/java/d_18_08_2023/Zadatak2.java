package d_18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite jmbg: ");
        int jmbg = s.nextInt();

        System.out.print("Unesite broj primeraka za stampu: ");
        int brojPrimerka = s.nextInt();


        for (int i = 1; i <= brojPrimerka; i++) {
            System.out.println("Primerak " + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
        }



    }
}
