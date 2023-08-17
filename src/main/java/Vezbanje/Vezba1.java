package Vezbanje;

public class Vezba1 {


    public static void main(String[] args) {

        int maxVrednostBoje = 255;

        int redBoja = 140;
        int greenBoja = 12;
        int blueBoja = 100;


        int kontrastRedBoja = maxVrednostBoje - redBoja;
        int kontrastGreenBoja = maxVrednostBoje - greenBoja;
        int kontrastBLueBoja = maxVrednostBoje - blueBoja;


        System.out.println("Orginalna Boja: RGB(" + redBoja + "," + greenBoja + "," + blueBoja + ")");
        System.out.println("Kontrastna Boja: RGB(" + kontrastRedBoja + "," + kontrastGreenBoja + "," + kontrastBLueBoja + ")");

    }
}
