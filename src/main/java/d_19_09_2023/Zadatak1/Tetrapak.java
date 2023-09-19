package d_19_09_2023.Zadatak1;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double cena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double cena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.cena = cena;
    }

    public Tetrapak(boolean reciklaza, double cena) {
        this.reciklaza = reciklaza;
        this.cena = cena;
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }




    @Override
    public double vracaCenu() {
        if (this.reciklaza) {
            return this.racunanjeTezine() * 1.5 + (this.cena);
        } else {
            return this.cena;
        }

    }

    @Override
    public void stampaj() {
        System.out.println("Da li moze da se reciklira: " + this.reciklaza);
        System.out.println("Osnovna cena: " + this.cena);
        System.out.println();

    }
}
