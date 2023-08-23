package p_22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        int countNula = 0;
        int broj;

        while (countNula < 2 ) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if(broj == 0 ){
                countNula = countNula + 1;
            }
        }
        System.out.println("Kraj programa jer je uneto 2 nule.");












    }
}
