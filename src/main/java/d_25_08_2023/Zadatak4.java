package d_25_08_2023;

public class  Zadatak4 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//        Napomena: Metoda nista ne vraca.


        stampa(5,'/');
    }

    public static void stampa(int n, char karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);
        }

    }
}
