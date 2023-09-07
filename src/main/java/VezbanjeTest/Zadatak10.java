package VezbanjeTest;

import java.util.Scanner;

public class Zadatak10 {
    //    Napisati program koji simulira korigovanje jacine zvuka na jutjubu.
//    Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video, je 75%. Korisnik
//    unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
//            ● up - akcija povecava jacinu zvuka za 10%
//            ● down - akcija smanjuje jacinu zvuka za 10%
//            ● mute - akcije postavlja jacinu zvuka na 0%
//    Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju
//    programa ispisati jacinu zvuka.
//    Primer izvrsenja 1:
//    Akcija: up
//    Akcija: up
//    Akcija: up
//    Akcija: down
//    Akcija: PLAY
//    Jacina zvuka je 90 %.
//    Primer izvrsenja loseg programa:
//    Akcija: up
//    Akcija: up
//    Akcija: up
//    Akcija: down
//    Akcija: PLAY
//    Jacina zvuka je 95%.
//    Primer izvrsenja 2:
//    Akcija: up
//    Akcija: mute
//    Akcija: up
//    Akcija: down
//    Akcija: down
//    Akcija: PLAY
//    Jacina zvuka je 0%.
//            (BONUS) Prema tekstu zadataka broj 2. Dozvoljene akcije su:
//            ● up - akcija povecava jacinu zvuka za 10%
//            ● down - akcija smanjuje jacinu zvuka za 10%
//            ● mute - akcija postavlja jacinu zvuka na 0%
//            ● unmute - akcija jacinu zvuka vraca na vrednost koja je bila pre mute akcije samo ako
//    je prethodna akcija bila mute, u suprotnom vraca na podrazumevanu vrednost od
//75%.
//    Primer izvrsenja 1:
//    Akcija: up
//    Akcija: mute
//    Akcija: up
//    Akcija: unmute
//    Akcija: PLAY
//    Jacina zvuka je 75%.
//    Primer izvrsenja 2:
//    Akcija: down
//    Akcija: mute
//    Akcija: unmute
//    Akcija: down
//    Akcija: PLAY
//    Jacina zvuka je 55%.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int jacinaZvuka = 75;
        boolean prethodnaAkcijaMute = false;

        while (true) {
            System.out.print("Akcija: ");
            String akcija = s.next();

            if (akcija.equals("up")) {
                jacinaZvuka += 10;
                if (jacinaZvuka > 100) {
                    jacinaZvuka = 100;
                }
            } else if (akcija.equals("down")) {
                jacinaZvuka -= 10;
                if (jacinaZvuka < 0) {
                    jacinaZvuka = 0;
                }
            } else if (akcija.equals("mute")) {
                jacinaZvuka = 0;
                prethodnaAkcijaMute = true;
            } else if (akcija.equals("unmute")) {
                if (prethodnaAkcijaMute) {
                    jacinaZvuka = 75;

                } else {
                    jacinaZvuka = 75;
                }
            } else if (akcija.equals("PLAY")) {
                break;
            } else {
                System.out.println("Nepoznata akcija. Dozvoljene akcije su: up, down, mute, PLAY");
            }
        }

        System.out.println("Jacina zvuka je " + jacinaZvuka + " %.");
    }
}








