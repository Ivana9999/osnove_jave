package p_25_08_2023;

public class Zadatak7 {
//    Napisati metodu koja proverava da li je trougao pravougli.
//    Metoda prima stranice trougla i hipotenuzu trougla.
//    Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//    Trougao je pravougli ukoliko je a*a+b*b=c*c


    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        boolean jePravougli = daLiJePravougliTrougao(a, b, c);
if (jePravougli) {
    System.out.println("Trougao je pravougli. ");
} else {
    System.out.println("Trougao nije pravougli. ");
}
    }

    public static boolean daLiJePravougliTrougao(double a, double b, double c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}