package d_19_09_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari;
    public PlaninarskiDom () {

    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = new ArrayList<>();
    }
    public void uclaniPlaninara (Planinar planinari) {
        this.planinari.add(planinari);
    }
    public double brojPlaninara (Planina planinari) {
        return brojPlaninara(planinari);
    }
    public void izbacivanjePlaninara (int idBroj) {
        for (int i =0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).getIdBroj()==idBroj) {
            this.planinari.remove(i);
            }
        }

    }
    public double mesecniPrihod () {
        double prihod = 0;
        for (int i =0; i < this.planinari.size(); i++) {
            prihod += this.planinari.get(i).clanarina();
        }
        return prihod;
    }
    public void stampaj () {
        for (int i =0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampaj();
        }
    }

}
