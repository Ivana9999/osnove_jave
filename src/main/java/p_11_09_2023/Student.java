package p_11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudzetu;

    public Student (String ime,String prezime, int brojIndeksa, boolean daLiJeNaBudzetu) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }


    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;

    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;

    }

    public boolean getBudzet() {
        return this.daLiJeNaBudzetu;
    }

    public void setDaLiJeNaBudzetu(boolean daLiJeNaBudzetu) {
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;


    }

    public void stampaj() {
        System.out.println("Ime: " + this.ime);
        System.out.println("Prezime: " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Da li je na budzetu: " + this.daLiJeNaBudzetu);

        if (this.daLiJeNaBudzetu) {
            System.out.println("Student je na budzetu.");
        } else {
            System.out.println("Student nije na budzetu.");
        }
    }
}