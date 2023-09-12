package p_11_09_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public int getStarost() {
        return this.starost;
    }

public void stampaj () {
    System.out.println("Ime i Prezime rezisera " + this.imeIPrezime + " " + " Starost: " + this.starost);

}
}