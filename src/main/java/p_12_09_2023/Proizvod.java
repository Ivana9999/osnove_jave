package p_12_09_2023;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaIzradeProizvoda;

    public Kupac kupac;

    public Proizvod (String nazivProizvoda, double cenaIzradeProizvoda, Kupac kupac) {
this.nazivProizvoda = nazivProizvoda;
this.cenaIzradeProizvoda = cenaIzradeProizvoda;
this.kupac = kupac;

    }

    public String getNazivProizvoda () {
        return nazivProizvoda;
    }
    public void setNazivProizvoda (String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }
    public double getCenaIzradeProizvoda () {
        return cenaIzradeProizvoda;
    }
    public void setCenaIzradeProizvoda (double cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;

    }
    public Kupac getKupac () {
        return kupac;
    }
    public void setKupac (Kupac kupac) {
        this.kupac = kupac;
    }

    public double racunajCenu () {
        return this.cenaIzradeProizvoda * 1.9 * (100 - this.kupac.getKarta().getPopust()) / 100;

    }
    public void stampaj () {
        System.out.println("Naziv proizvoda: " + this.nazivProizvoda + " - " + "Cena: " +  this.racunajCenu() + " dinara");
        this.kupac.stampaj();
    }
    }
