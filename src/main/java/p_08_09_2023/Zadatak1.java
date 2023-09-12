package p_08_09_2023;


public class Zadatak1 {
//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//(dopuna) kreirati metodu za stampu koja stampa podatke u formatu
//[ime i prezime osobe] - [kad je poslata]
//            [Tekst poruke]
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke

    public static void main(String[] args) {


        SlackMessage2 slack1 = new SlackMessage2();
        slack1.tekstPoruke = "Hi";
        slack1.imeIPrezime = "Srecko";
        slack1.datumIVreme = "07-09-2023 20:25";

        SlackMessage2 slack2 = new SlackMessage2();
        slack2.tekstPoruke = "Heloo";
        slack2.imeIPrezime = "Micko";
        slack2.datumIVreme = "11-10-2023 20:30";

        slack1.stampaj();
        slack2.stampaj();

       slack1.azuriranje("caaooossos" , "11-12-2023 ");
       slack2.azuriranje("heelo " , "08-08.2023 ");

   slack1.stampaj();
   slack2.stampaj();


    }
}
