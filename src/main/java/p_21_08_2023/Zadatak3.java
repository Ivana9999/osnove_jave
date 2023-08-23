package p_21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        String s = "...";

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

               s = s + i;
            } else {
                s = i + s;
            }

        }
        System.out.println(s);


    }
}