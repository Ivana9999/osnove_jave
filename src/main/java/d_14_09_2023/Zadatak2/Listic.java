package d_14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> nizKombinacija;

    public Listic () {
        this.nizKombinacija = new ArrayList<>();
    }

    public void dodajKombinaciju (Kombinacija kombinacija) {
        this.nizKombinacija.add(kombinacija);
    }

    public boolean dobitna (Kombinacija kombinacija) {
        for(int i = 0; i< this.nizKombinacija.size(); i++) {
            if(this.nizKombinacija.get(i).daLiJeIstaKombinacija(kombinacija)) {
                return true;
            }
        }
        return false;
    }

    public void stampaj () {
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            this.nizKombinacija.get(i).stampaj();
        }
    }
}
