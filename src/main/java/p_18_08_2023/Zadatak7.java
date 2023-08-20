package p_18_08_2023;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);

        System.out.println("Unesite jacinu zvuka (od 0 do 10): ");
        int jacinaZvuka = s.nextInt();

        if(jacinaZvuka < 0 || jacinaZvuka > 10) {
            System.out.println("");
        }

    }
}
