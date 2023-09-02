package p_21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        String triTacke = "...";

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

               triTacke = triTacke + i;
            } else {
                triTacke = i + triTacke;
            }

        }
        System.out.println(triTacke);


    }
}