package p_18_09_2023.Zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    //    Kreirati abstraktnu klasu Figura koja ima
//    abstraktnu metodu povrsina
//    abstraktnu metodu obim
//    metodu koja stampa podatke u formatu:
//    Povrsina je (povrsina)
//    Obim je (obim)
//    Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//    stranicu a
//    gettere/settere/konstruktore
//    implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//    implementira metodu obim
//    Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//    stranice a i b
//    gettere/settere/konstruktore
//    implementira metodu povrsina
//    implementira metodu obim
//    U glavnom programu kreirati niz figura (niz od 3 pravougaonika i 2 trougla). Zatim odstampati na ekranu sve figure i sume njhovih povrsina i obima.
//    Kreirati klasu FigureGenerator koja ima:
//    Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
//    U glavnom programu generisati 3 pravougaonika i 2 trougla
    public static void main(String[] args) {


        JednakotranicniTrougao trougao = new JednakotranicniTrougao(5);
        Pravougaonik pravougaonik = new Pravougaonik(5,10);
        trougao.stampaj();
        pravougaonik.stampaj();

        ArrayList<Figura> figure = new ArrayList<>();

 figure.add(new JednakotranicniTrougao(2));
 figure.add(new JednakotranicniTrougao(4));
 figure.add(new Pravougaonik(5, 10));
 figure.add(new Pravougaonik(6,12));
 figure.add(new Pravougaonik(4, 8));

for (int i=0; i <figure.size(); i++) {
    figure.get(i).stampaj();
}


double povrsine = 0;
double obimi = 0;
for (int i = 0; i < figure.size(); i++) {
    povrsine = povrsine + figure.get(i).povrsina();
    obimi = obimi + figure.get(i).obim();

}
        System.out.println("Ukupna povrsina je: " + povrsine);
        System.out.println("Ukupni obim je: " + obimi);
    }
}

