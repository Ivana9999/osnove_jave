package d_12_09_2023.Zadatak3;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private double trenutnoStanjeNaRacunu;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public Racun(String brojRacuna, String imeIPrezime, double trenutnoStanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanjeNaRacunu() {
        return trenutnoStanjeNaRacunu;
    }


    public void uplatiNaRacun (double iznos) {
        if (iznos > 0 ) {
            trenutnoStanjeNaRacunu += iznos;
        }

    }
    public void skiniSaRacuna (double iznos) {
      if (iznos > 0 && iznos <= trenutnoStanjeNaRacunu) {
    trenutnoStanjeNaRacunu -= iznos;
      }

}

public void stampaj () {
    System.out.println("Ime i prezime: " + this.imeIPrezime + " - broj racuna: " + this.brojRacuna);
    System.out.println("Stanje na racunu je (" + this.trenutnoStanjeNaRacunu + ") rsd.");

}

    }

