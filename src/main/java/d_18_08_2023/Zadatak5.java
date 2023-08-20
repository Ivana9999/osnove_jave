package d_18_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print("-" + i + ", " );
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}