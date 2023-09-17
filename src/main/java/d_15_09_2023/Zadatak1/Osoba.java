package d_15_09_2023.Zadatak1;

public class Osoba {
    protected String imeIPrezime;
    protected int jmng;
    protected int godinaRodjenja;

    public Osoba () {

    }

    public Osoba(String imeIPrezime, int jmng, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmng = jmng;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getJmng() {
        return jmng;
    }

    public void setJmng(int jmng) {
        this.jmng = jmng;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj () {
        System.out.println("("  + this.imeIPrezime + ") , " + " (" + this.jmng + "), " +" (" + this.godinaRodjenja + ")");
    }
}
