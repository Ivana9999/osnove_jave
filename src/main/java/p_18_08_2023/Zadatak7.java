package p_18_08_2023;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka od 0 do 10: ");
        int jacinaZvuka = s.nextInt();

        if (jacinaZvuka < 0 || jacinaZvuka > 10) {
            System.out.println(" | ");
        } else if (jacinaZvuka == 0) {
            System.out.println(" </ ");
        } else {
            System.out.print("< ");
            for (int i = 0; i < jacinaZvuka; i++) {
                System.out.print("| ");
            }
            System.out.println();
            System.out.print("< ");
            for (int i = 1; i <= jacinaZvuka; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

