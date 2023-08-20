package p_18_08_2023;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Uneti broj a: ");
        int a = s.nextInt();

        if (a < 10 ) {
            System.out.println("Jednocifren broj");
        } else if (a < 100) {
            System.out.println("Dvocifren broj");
        } else {
            System.out.println("Trocifren broj");
        }






    }
}
