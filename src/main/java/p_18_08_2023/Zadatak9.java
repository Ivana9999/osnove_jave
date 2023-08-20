package p_18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj A: ");
      int a =s.nextInt();

        System.out.print("Unesite broj B: ");
       int b = s.nextInt();

       for (int i = 1; i<=10; i++) {
           if (a != i && b != i) {
               System.out.print(i+ ", ");
           }

       }
       }

    }

