package p_19_09_2023.Zadatak2;

public abstract class Atleticar {
    private String imeIPrezime;
    protected int rezultat;

    public abstract  boolean boljiRezultatOd ( Atleticar atleticar);

    public Atleticar(String imeIPrezime, int rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public void stampaj () {
        System.out.println("(" + this.imeIPrezime + "), " + "(" + this.rezultat + ")" );
    }
}
