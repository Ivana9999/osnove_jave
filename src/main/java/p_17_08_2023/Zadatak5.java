package p_17_08_2023;
 import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

Scanner s = new Scanner(System.in);
        System.out.println("Uneti b: ");
        int b = s.nextInt();

        System.out.println("Uneti c: ");
        int c = s.nextInt();

        System.out.println("Uneti a: ");
        int a = s.nextInt();

        if (a >= b && a <=c) {
            System.out.println("A je u opsegu izmedju: " + b + " i " + c);
        }





    }
}
