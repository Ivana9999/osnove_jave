package VezbanjeTest;

import java.util.Scanner;

public class Zadatak6 {
//     Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//    zaredom.Na kraju programa ispisati sumu unetih brojeva.
//    Primer izvršenja 1:
//    Unesite broj: 1
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 5
//    Unesite broj: 9
//    Unesite broj: 0
//    Unesite broj: 0
//    Suma je 19
//    Primer izvrsenja 2:
//    Unesite broj: 1
//    Unesite broj: 1
//    Unesite broj: 0
//    Unesite broj: 1
//    Unesite broj: 0
//    Unesite broj: 9
//    Unesite broj: 0
//    Unesite broj: 0
//    Suma je 12
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int suma = 0;
        int poslednjiBroj = -1;
        boolean isValid = false;



        while(!isValid) {
            System.out.print("Unesite broj: ");
           int n = s.nextInt();
            if (n == 0 && poslednjiBroj == 0) {
               isValid = true;
            }
            poslednjiBroj = n;
            suma = suma + n;
        }

        System.out.println("Suma je " + suma);



    }
}
