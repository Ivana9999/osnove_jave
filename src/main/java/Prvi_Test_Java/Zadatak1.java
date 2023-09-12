package Prvi_Test_Java;

import java.util.Scanner;

public class Zadatak1 {
//    Napišite program koji simulira softver za upoznavanje stvoren posebno za žene,
//    pružajući im priliku da upoznaju muškarca svojih snova.
//    U prvoj verziji programa, ženama je ponuđeno pet faktora prema kojima mogu odabrati svog idealnog muškarca.
//    Ovi faktori uključuju:
//    Visina muškarca u određenom rasponu.
//    Grad iz kojeg bi trebao biti muškarac.
//    Starost muškarca u određenom rasponu.
//    Boja kose muškarca.
//    Prisustvo brade kod muškarca.
//
//    Program na početku traži od korisnica da unesu kriterijume koje žele kod svog idealnog partnera,
//    a zatim i informacije o muškarcu kojeg žele upoznati.
//    Na kraju, program će izbaciti rezultat da li su dvoje kompatibilni ili ne.
//    Dvoje se smatraju kompatibilnima ako muškarac zadovoljava barem tri od pet faktora koje su žene
//    definisale.
//
//    Evo primera izvršenja programa:
//
//            **Primer izvršenja 1:**
//    Unesite kriterijume za traženje vašeg idealnog muškarca.
//    Min visina: 180
//    Max visina: 200
//    Mesto: Niš
//    Min starost: 30
//    Max starost: 35
//    Boja kose: Crna
//    Potrebno je da ima bradu: true
//
//    Unesite karakteristike muškarca:
//    Visina: 190
//    Mesto: Niš
//    Starost: 32
//    Boja kose: Plava
//    Nosi bradu: false
//    Pronašli ste svog idealnog muškarca!
//
//            **Primer izvršenja 2:**
//    Unesite kriterijume za traženje vašeg idealnog muškarca.
//    Min visina: 180
//    Max visina: 200
//    Mesto: Niš
//    Min starost: 30
//    Max starost: 35
//    Boja kose: Crna
//    Potrebno je da ima bradu: true
//
//    Unesite karakteristike muškarca:
//    Visina: 190
//    Mesto: Beograd
//    Starost: 32
//    Boja kose: Plava
//    Da li ima bradu: false
//    Muškarac ne ispunjava vaše zahteve.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca.");
        System.out.print("Min visina: ");
        int minVisina = s.nextInt();
        System.out.print("Max visina: ");
        int maxVisina = s.nextInt();

        System.out.print("Mesto: ");
        String mesto = s.next();
        System.out.print("Min starost: ");
        int minStarost = s.nextInt();
        System.out.print("Max starost: ");
        int maxStaros = s.nextInt();

        System.out.print("Boja kose: ");
        String bojaKose = s.next();
        System.out.print("Potrebno je da ima bradu: ");
        boolean imaBradu = s.nextBoolean();

        System.out.println("Unesite karakteristike muškarca: ");
        System.out.print("Visina: ");
        int visinaMuskarca = s.nextInt();

        System.out.print("Mesto: ");
        String mestoMuskarca = s.next();
        System.out.println("Starost: ");
        int starost = s.nextInt();

        System.out.print("Boja kose: ");
        String bojaKoseMuskarca =s.next();

        System.out.print("Da li ima bradu: ");
        boolean imabraduMuskarac = s.nextBoolean();

        int faktori = 0;

        if(visinaMuskarca > minVisina && visinaMuskarca < maxVisina) {
            faktori = faktori + 1;
        }
        if (mestoMuskarca.equals(mesto)) {
            faktori = faktori + 1;
        }
        if (starost > minStarost && starost < maxStaros) {
            faktori = faktori + 1;
        }
        if (bojaKoseMuskarca.equals(bojaKose)) {
                 faktori = faktori + 1;
        }
        if (imaBradu == imabraduMuskarac) {
                  faktori = faktori + 1;
        }

         if(faktori >= 3) {
             System.out.println("Pronašli ste svog idealnog muškarca!");
         } else {
                      System.out.println("Muškarac ne ispunjava vaše zahteve.");
         }
    }
}
