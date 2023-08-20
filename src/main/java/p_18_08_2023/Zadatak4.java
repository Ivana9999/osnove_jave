package p_18_08_2023;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print(i);

            if (i < 20) {
                System.out.print(", ");
            }
        }
    }
}