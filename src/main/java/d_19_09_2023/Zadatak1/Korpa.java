package d_19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa{
   private ArrayList<Ambalaza> ambalaza;

    public Korpa(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.ambalaza = new ArrayList<>();
    }

    public ArrayList<Ambalaza> getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(ArrayList<Ambalaza> ambalaza) {
        this.ambalaza = ambalaza;
    }
    public void dodajAmbalazu (Ambalaza ambalaza) {
        this.ambalaza.add(ambalaza);
    }
    public void izbaciAmbalazu (String barKod) {
for (int i = 0; i < this.ambalaza.size(); i++) {
    if (this.ambalaza.get(i).getBarkod().equals(barKod)) {
        this.ambalaza.remove(i);

    }
}
    }
    private double cenaSaPopustom (double popust) {
        double cenaPopust = 0;
        for (int i = 0; i < this.ambalaza.size(); i ++) {
            cenaPopust += this.ambalaza.get(i).vracaCenu() - popust;

        }
return cenaPopust;
    }
    public double ukupnaCena (SuperKartica kartica) {
        double ukupnaCenaKorpe = 0;
        for (int i = 0; i < this.ambalaza.size(); i ++ ) {
            ukupnaCenaKorpe += this.ambalaza.get(i).vracaCenu();

        }
        return ukupnaCenaKorpe - kartica.getPopust();
    }
}
