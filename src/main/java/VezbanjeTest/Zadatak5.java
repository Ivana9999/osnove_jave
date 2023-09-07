package VezbanjeTest;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
//    Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//    mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//    BMI se računa po formuli
//            𝐵𝑀𝐼 = 𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
//            (𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)2
//    dok se kategorija određuje prema tabeli 1.1.
//    Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
//    Primer izvrsenja: Unesite tezinu osobe (kg): 110
//    Unesite visinu osobe (m): 1.9
//    Kategorija je Gojaznost

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite tezinu osobe (kg): ");
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();

        double bmi = tezina / visina * visina;

        if (bmi < 18.5) {
            System.out.println("Kategorija je Neuhranjenost ");
        } else if (bmi > 18.5 && bmi < 24.99){
            System.out.println("Kategorija je Normalna tezina");
        } else if (bmi > 25 && bmi < 29.99){
            System.out.println("Kategorija je Prekomerna tezina");
        } else if (bmi > 30) {
            System.out.println("Kategorija je Gojaznost");
        }

    }
}
