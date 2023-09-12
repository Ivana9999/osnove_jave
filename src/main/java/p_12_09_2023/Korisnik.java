package p_12_09_2023;

public class Korisnik {
    private String imeIPrezime;
    String tipLicence;


    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.tipLicence = "basic";

    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }

    public void pretplatiSe(int nadoknada) {
        if (nadoknada == 100) {
            this.tipLicence = "pro";

        } else if (nadoknada == 150) {
            this.tipLicence = "premium";

        }
    }

    public void ponistiPretplatu() {
        this.tipLicence = "basic";
    }

    public int maksimalnaDuzinaTrajanja() {
        if (this.tipLicence.equals("pro")) {
            return 240;
        } else if (this.tipLicence.equals("premium")) {
            return 1440;
        } else {
            return 40;
        }
    }

    public void stampaj () {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
    }
}
