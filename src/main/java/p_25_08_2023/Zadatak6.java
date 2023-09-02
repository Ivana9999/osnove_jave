package p_25_08_2023;

public class Zadatak6 {
//     Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//    Primer: Ako se metoda pozove za N=10, vraca -10
//    Ako se metoda pozove za N=-11, vraca 11

    public static void main(String[] args) {


        int n1 = 10;
        int n2 = -11;

        int reversedN1 = reverseSign(n1);
        int reversedN2 = reverseSign(n2);

        System.out.println("Za N= " + n1 + ", vraca " + reversedN1);
        System.out.println("Za N= " + n2 + ", Vraca " + reversedN2);


    }

    public static int reverseSign(int n) {
      return  - n;

    }
}