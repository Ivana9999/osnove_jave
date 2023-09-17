package d_15_09_2023.Zadatak1;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac () {

    }

    public Igrac(String imeIPrezime, int jmng, int godinaRodjenja,int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmng, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    public void stampaj () {
        super.stampaj();
        System.out.println("Broj: " + this.broj + " Pozicija: " + this.pozicija + "Da li je kapiten: " + this.kapiten);
    }
}
