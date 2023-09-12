package p_07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//            [ime i prezime osobe] - [kad je poslata]
//            [Tekst poruke]


        SlackMessage a = new SlackMessage();
        a.tekstPoruke = "Hi";
        a.imeIPrezime = "Srecko";
        a.datumIVreme = "07-09-2023 20:25";

        SlackMessage b = new SlackMessage();
        b.tekstPoruke = "Heloo";
        b.imeIPrezime = "Micko";
        b.datumIVreme = "11-10-2023 20:30";

        System.out.println(a.imeIPrezime + " - " + a.datumIVreme);
        System.out.println(a.tekstPoruke);

        System.out.println(b.imeIPrezime + " - " + b.datumIVreme);
        System.out.println(b.tekstPoruke);


    }
}
