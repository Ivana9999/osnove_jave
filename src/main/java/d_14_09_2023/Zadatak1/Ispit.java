package d_14_09_2023.Zadatak1;

public class Ispit {
    private String nazivPredmeta;
    private double ocena;
    private String imeIPrezimeProfesora;

    public Ispit(String nazivPredmeta, double ocena, String imeIPrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }
    public boolean polozenIspit () {
        if (this.ocena >= 6 && this.ocena <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public void stampaj () {
        System.out.println(  "(" + this.nazivPredmeta + ") - "  + " ( " + this.imeIPrezimeProfesora + ") " + " - (" +  this.ocena + ")" );
    }
}
