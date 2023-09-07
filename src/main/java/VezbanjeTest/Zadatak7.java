package VezbanjeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
//    Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//    je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
//7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//    Program na kraju ispisuje da li je dobitna kombinacija.Primer poziva metoda:
//    Ako se unesu nizovi:
//            ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
//● Program stampa “Nije dobitna kombinacija”
//    Ako se metoda pozove za:
//            ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
//            ● Program stampa “Jeste dobitna kombinacija”
//    Napomena: Resenje preko petlje nosi maksimalni broj poena, dok resenje bez petlji nosi
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList <Integer> odigrana = new ArrayList<>();
        ArrayList <Integer> izvucena  = new ArrayList<>();

        odigrana.add(1);
        odigrana.add(2);
        odigrana.add(3);
        odigrana.add(4);
        odigrana.add(5);
        odigrana.add(33);
        odigrana.add(29);


        izvucena.add(1);
        izvucena.add(2);
        izvucena.add(3);
        izvucena.add(4);
        izvucena.add(5);
        izvucena.add(33);
        izvucena.add(29);


     boolean rezultat = poredi(odigrana, izvucena);

     if(rezultat) {
         System.out.println("Jeste dobitna kombinacija");
     } else {
         System.out.println("Nije dobitna kombinacija");
     }


    }

    public static boolean poredi(ArrayList<Integer> odigrana, ArrayList<Integer> izvucena) {

        for(int i=0; i< 7; i++) {
            if(!odigrana.get(i).equals(izvucena.get(i))) {
            return  false;
            }

        }

        return true;
    }





}
