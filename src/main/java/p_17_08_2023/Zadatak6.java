package p_17_08_2023;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

        System.out.println("Uneti a: ");
        int a = s.nextInt();

        System.out.println("Uneti b: ");
        int b = s.nextInt();

        System.out.println("Uneti c: ");
        int c = s.nextInt();

        if (a < 0 ) {
            System.out.println("Uneti broj A=" + a + " nije validan ");
        }
        if (b < 0) {
            System.out.println("Uneti broj B=" + b +  "nije validan ");
        }
       if (c < 0 ) {
        System.out.println("Uneti broj C=" + c + " nije validan ");
}



    }
}
