package d_12_09_2023.Zadatak1;

public class Ugovor {
    private int godina;
    private int mesec;
    private int dan;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresanekretnine;

    public Ugovor(int godina, int mesec, int dan, FizickoLice prodavac, FizickoLice kupac, double cena, String adresanekretnine) {
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresanekretnine = adresanekretnine;
    }

    public double procenatZarade() {
        if (this.kupac.getPrethodnoKupovao()) {
            return 0.02;
        } else {
            return 0.03;

        }

    }
    public double zaradaAgencije (double procenatZarade) {
        return 1000 + this.cena * procenatZarade;
    }

    public void stampaj (double zaradaAgencije) {
        System.out.print("Dana " + "(" + this.dan + "." +  this.mesec + "." +  this.godina + ".)" + " god sklopljen je ugovor izmedju (");
        this.prodavac.stampaj();
        System.out.print(") i");
        System.out.println(" (");
        this.kupac.stampaj();
        System.out.print(") o kupovini nekretnine " + this.adresanekretnine + " po ceni " + this.cena );
        System.out.println("");
        System.out.print("pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od ");
        System.out.println( zaradaAgencije);


    }
}
