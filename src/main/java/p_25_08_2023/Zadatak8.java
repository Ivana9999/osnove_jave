package p_25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
//    //    Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//// 1 - I
////2 - II
////3 - III
////4 - IV
////5 - V
////    Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//////    Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.
//    public static void main(String[] args) {
//


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi rimski broj ");
        String rimskiBroj = s.next();
        System.out.println(konverzija(rimskiBroj));

    }

    public static int konverzija(String rimskiBroj) {
        if (rimskiBroj.equals("I")) {
            return 1;

        } else if (rimskiBroj.equals("II")) {
            return 2;

        } else if (rimskiBroj.equals("III")) {
            return 3;

        } else if (rimskiBroj.equals("IV")) {
            return 4;

        } else if (rimskiBroj.equals("V")) {
            return 5;
        }
        return 0;
    }
}