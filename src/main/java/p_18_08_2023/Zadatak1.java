package p_18_08_2023;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj N: ");
        int n = s.nextInt();

        System.out.println("Unesite akciju: ");
        String akcija = s.next();


        if (akcija.equals("Uvecaj: ")) {
            n=n+1;
        }
if (akcija.equals("Smanji: "));
        {
            n=n-1;
        }
        System.out.println("N: " + n);









    }
}
