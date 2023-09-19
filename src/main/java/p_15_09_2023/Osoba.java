package p_15_09_2023;

public class Osoba {
    protected String imeIPrezime;
    protected int jmbg;

    public Osoba() {

    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + this.imeIPrezime + " jmbg: " + this.jmbg);
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


    }

