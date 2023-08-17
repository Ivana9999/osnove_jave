package p_17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite broj telefona: ");
        String brojTelefona = s.next();

        System.out.print("Unesite email: ");
        String email = s.next();

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();

        String podaci = "(" + ime + " " + prezime + ") - (" + jmbg + ")\n"
                + "Broj Tel: " + brojTelefona + "\n"
                + "Email: " + email;

        System.out.println(podaci);

    }
}
