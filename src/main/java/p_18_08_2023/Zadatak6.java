package p_18_08_2023;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);

        System.out.println("Uneti M: ");
        int M = s.nextInt();

        System.out.println("Uneti N: ");
        int N = s.nextInt();

         for(int i = M; i <=N; i++) {
             System.out.print(i);

             if (i <=N ) {
                 System.out.print(" , ");
             }
         }
    }
}
