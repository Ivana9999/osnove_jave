package d_25_08_2023;

public class Zadatak7 {

//    Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//    Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//    Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

    public static void main(String[] args) {
        System.out.println(minimum(4,6,1));
        System.out.println(minimum(4,6,33));
    }

    public static int minimum(int a, int b, int c) {
        int min;

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= c) {
            min = b;
        } else {
            min = c;
        }

        return min;
    }
}
