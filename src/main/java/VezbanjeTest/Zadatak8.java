package VezbanjeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati program koji simulira pretragu “IT Bootcamp” na guglu. Program cuva rezultate
//        pretrage kao niz podataka (pogledaj link). Korisnik unosi stranu za prikaz i koliko hoce
//        rezultata da bude prikazano na strani a zatim se rezultati pretrage prikazuju korisniku.
//                Primer izvrsenja 1:
//        Unesite stranu: 1
//        Unesite broj rezultata po strani: 5
//        Rezultati pretrage su:
//        ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...
//        Prijava - Beograd - ITBootcamp
//        IT Bootcamp kursevi
//        IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...
//        IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...
//        Primer izvrsenja 2:
//        Unesite stranu: 3
//        Unesite broj rezultata po strani: 3
//        Rezultati pretrage su:
//        Otvorene prijave za IT Bootcamp, program obuke ... - Startit
//        Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp ...
//        Vesti - Početak rada neprofitne IT škole - IT Bootcamp

        ArrayList<String> listaRezultata = new ArrayList<>();

        listaRezultata.add("ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...");
        listaRezultata.add("Prijava - Beograd - ITBootcamp");
        listaRezultata.add("IT Bootcamp kursevi");
        listaRezultata.add("IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...");
        listaRezultata.add("IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...");
        listaRezultata.add("IT Bootcamp | LinkedIn");
        listaRezultata.add("Otvorene prijave za IT Bootcamp, program obuke ... - Startit");
        listaRezultata.add("Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp ...");
        listaRezultata.add("Vesti - Početak rada neprofitne IT škole - IT Bootcamp");
        listaRezultata.add("Otvorene prijave za IBootcampT  u Nišu : Ekonomija : Južne ...");
        listaRezultata.add("Vesti - IT Bootcamp: traži se predavač Jave u Beogradu");
        listaRezultata.add("I spent 3 months applying to jobs after a coding bootcamp ...");
        listaRezultata.add("Are Coding Bootcamps Worth It? | Course Report");
        listaRezultata.add("Free Coding Bootcamps: The Best No-Cost Coding Programs");
        listaRezultata.add("Coding Dojo: Coding Bootcamp - Learn Coding & Data Science");
        listaRezultata.add("Free Coding Bootcamp Prep Course | Flatiron School");
        listaRezultata.add("Coding Bootcamp Kyoto | Le Wagon");
        listaRezultata.add("Bootcamps won't make you a coder: Here's what will ...");
        listaRezultata.add("2020 Best Coding Bootcamps - SwitchUp.org");
        listaRezultata.add("Software Engineering Coding Bootcamp | Hack Reactor");
        listaRezultata.add("Coding Bootcamp | USF Corporate Training and Professional ...");
        listaRezultata.add("Is a Coding Bootcamp right for me? | Ubiqum Code Academy");
        listaRezultata.add("Istanbul Coding Bootcamp - Summer 2020 — Re:Coded");
        listaRezultata.add("What Are IT Boot Camps? Webopedia Definition");
        listaRezultata.add("Coding bootcamp - Wikipedia");
        listaRezultata.add("IT Bootcamp #2 online edition – Data Analytics in the Cloud");
        listaRezultata.add("Coding Bootcamp Market Current Trends, Segmentation, Key ...");
        listaRezultata.add("Learn Coding Bootcamps with Online Courses and Lessons ...");
        listaRezultata.add("What is a coding bootcamp? — Firehose Project");
        listaRezultata.add("Coding Bootcamp Programs Overview| ComputerScience.org");
        listaRezultata.add("Program Details | Tech Elevator Coding Bootcamp");
        listaRezultata.add("IT Bootcamp škola nastavlja online nastavu - Resurs Centar");
        listaRezultata.add("Houston's #1 Rated Coding Bootcamp - DigitalCrafts");
        listaRezultata.add("Toronto Coding Bootcamp: Advanced Front End Web ...");
        listaRezultata.add("The 15 best coding schools and coding bootcamps in Europe ...");
        listaRezultata.add("How Much Can You Make After Coding Bootcamp? Eleven ...");
        listaRezultata.add("Is a Coding Bootcamp Worth It? Find out. - Analytics, Product ...");
        listaRezultata.add("7 Phases of Changing Careers through a Coding Bootcamp ...");

        Scanner s = new Scanner(System.in);
        System.out.print("Uneiste stranu: ");
        int strana = s.nextInt();

        strana--;
        System.out.print("Unseite broj rezultata po strani: ");
        int brojRezultata = s.nextInt();

        for (int i = strana * brojRezultata; i < strana * brojRezultata + brojRezultata; i++) {
            System.out.println(listaRezultata.get(i));
        }



    }
}
