package p_11_09_2023;

public class Film {
    private String nazivFilma;
    private int goodinaFilma;
    private Reziser directedBy;

    public Film (String nazivFilma, int goodinaFilma, Reziser directedBy) {
        this.nazivFilma = nazivFilma;
        this.goodinaFilma = goodinaFilma;
        this.directedBy = directedBy;
    }

    public String getNazivFilma() {
        return this.nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;

    }

    public int getGodinaFilma() {
        return this.goodinaFilma;
    }

    public void setGodinaFilma(int goodinaFilma) {
        this.goodinaFilma = goodinaFilma;
    }
    public void stampaj () {
        System.out.println("Naziv filma: " + this.nazivFilma  + " " + "Godina izdanja: " + this.goodinaFilma);
        System.out.println("Reziser: " + this.directedBy.getImeIPrezime() + " " + this.directedBy.getStarost());
    }



}
