package p_12_09_2023;

public class Kupac {
    private String imeIPrezime;
    public ClanskaKarta karta;


    public Kupac (String imeIPrezime, ClanskaKarta karta) {
        this.imeIPrezime = imeIPrezime;
        this.karta = karta;

    }
    public void setImeIPrezime (String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getImeIPrezime () {
        return this.imeIPrezime;
    }
    public void setKarta (ClanskaKarta karta) {
        this.karta = karta;
    }
    public ClanskaKarta getKarta () {
        return this.karta;
    }

    public void stampaj () {
        System.out.println(imeIPrezime + " - " + this.karta.getBrojKartice());

    }
}
