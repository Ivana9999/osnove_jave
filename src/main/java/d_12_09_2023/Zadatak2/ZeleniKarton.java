package d_12_09_2023.Zadatak2;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String getImeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIPrezimeStudenta, int brojIndeksa, String nazivPredmeta, String getImeIPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.getImeIPrezimeProfesora = getImeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getGetImeIPrezimeProfesora() {
        return getImeIPrezimeProfesora;
    }

    public void setGetImeIPrezimeProfesora(String getImeIPrezimeProfesora) {
        this.getImeIPrezimeProfesora = getImeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean daliJePolozenIspit() {
        if (this.ocena > 5) {
         return true;
        } else {
            return false;
        }

        }
        public void stampaj () {
            System.out.println("(" + this.nazivPredmeta + ")" + " - " + "(" + this.ocena + ")");
            System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + " broj indeksa " + this.brojIndeksa);
            System.out.println("Profesor: " + this.getImeIPrezimeProfesora);

        }
    }


