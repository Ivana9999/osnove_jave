package d_17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Uneti actual url: ");
        String a = s.next();

        System.out.print("Uneti expected url: ");
        String b = s.next();

        System.out.print("Uneti error: ");
        String c = s.next();


        if (!a.equals(b)) {
            System.out.println("Assertion Error: Expected " + b + " but got " + a + "error code: " + c);
        } else {
            System.out.println("1 Test passed.");


        }
    }
}