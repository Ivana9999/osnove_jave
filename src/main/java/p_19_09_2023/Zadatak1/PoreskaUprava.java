package p_19_09_2023.Zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    ArrayList<Objekat> objekti;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat) {
        objekti.add(objekat);
    }

    public Objekat najveciPorez() {
        Objekat objekatNajveciPorez = objekti.get(0);
        double najveciPorez = objekti.get(0).izracunajPorez();
        for (int i = 1; i < this.objekti.size(); i++) {
            double porez = this.objekti.get(i).izracunajPorez();
            if (porez > najveciPorez) {
                najveciPorez = porez;
                objekatNajveciPorez = this.objekti.get(i);
            }

        }
        return objekatNajveciPorez;
    }

    public Objekat najmanjiPorez() {
        Objekat objekatNajmanjiPorez = objekti.get(0);
        double najmanjiPorez = objekti.get(0).izracunajPorez();
        for (int i = 1; i < this.objekti.size(); i++) {
            double porez = this.objekti.get(i).izracunajPorez();
            if (porez < najmanjiPorez) {
                najmanjiPorez = porez;
                objekatNajmanjiPorez = this.objekti.get(i);

            }
        }
        return objekatNajmanjiPorez;
    }
    public double ukupanPorez () {
        double ukupan = 0.0;
        for (int i = 0; i < this.objekti.size(); i++) {
            ukupan += this.objekti.get(i).izracunajPorez();
        }
        return ukupanPorez();
    }
    public void stampajSveObjekte () {
        System.out.println("Objekti u gradu: " + this.imeGrada + ":");
        for (Objekat objekat : objekti) {
            objekat.stampaj();
        }

    }
}
