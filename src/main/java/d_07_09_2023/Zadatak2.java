package d_07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Automobil auto1 = new Automobil();

        auto1.marka = "Peugeot";
        auto1.model = "508 gt line";
        auto1.godinaProizvodnnje = 2023;

        Automobil auto2 = new Automobil();

        auto2.marka = "Mercedes";
        auto2.model = "AMG GT";
        auto2.godinaProizvodnnje = 2024;

        Automobil auto3 = new Automobil();

        auto3.marka = "Hyundai";
        auto3.model = "Elantra";
        auto3.godinaProizvodnnje = 2023;

        System.out.println("Marka: " + auto1.marka + " Model: " + auto1.model + " Godina proizvodnje: " + auto1.godinaProizvodnnje);
        System.out.println("Marka: " + auto2.marka + " Model: " + auto2.model + " Godina proizvodnje: " + auto2.godinaProizvodnnje);
        System.out.println("Marka: " + auto3.marka + " Model: " + auto3.model + " Godina proizvodnje: " + auto3.godinaProizvodnnje);
    }
}
