package p_18_09_2023.Zadatak1;

public abstract class Student {
    protected String imeIPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    public Student(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract double cenaSkolarine();

    public abstract boolean daLiJeNaBudeztu();
    public void stampaj () {
        System.out.println(this.imeIPrezime + ", " + this.brojIndeksa + ", " + this.godinaStudija );
        System.out.println("Finansiranje: ");
        if (daLiJeNaBudeztu() ==true) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }
}
