package d_15_09_2023.Zadatak2;

public class Osoba {
    protected String imeIPrezime;
    protected int jmbg;
    protected int godinaRodjenja;

    public Osoba () {


    }

    public Osoba(String imeIPrezime, int jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj () {
        System.out.println("(" + this.imeIPrezime + ") ,  " + " (" + this.jmbg + "), " + " ( " + this.godinaRodjenja + ")" );

    }
}
