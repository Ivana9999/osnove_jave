package p_12_09_2023;

public class Sastojak {
    private String nazivSastojka;
    private int cena;

    public Sastojak(String nazivSastojka, int cena) {
        this.nazivSastojka = nazivSastojka;
        this.cena = cena;

    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;

    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}