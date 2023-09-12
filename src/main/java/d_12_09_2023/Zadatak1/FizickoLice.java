package d_12_09_2023.Zadatak1;

public class FizickoLice {
    private String imeIPrezime;
    private int brojLicnekarte;
    private int jmbg;
    private boolean prethodnoKupovao;

    public FizickoLice(String imeIPrezime, int brojLicnekarte, int jmbg, boolean prethodnoKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicnekarte = brojLicnekarte;
        this.jmbg = jmbg;
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojLicnekarte() {
        return brojLicnekarte;
    }

    public void setBrojLicnekarte(int brojLicnekarte) {
        this.brojLicnekarte = brojLicnekarte;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public boolean getPrethodnoKupovao() {
        return prethodnoKupovao;
    }

    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public void stampaj () {
        System.out.print("Ime i prezime: " + this.imeIPrezime + " Broj licne karte: " + this.brojLicnekarte);

    }



}
