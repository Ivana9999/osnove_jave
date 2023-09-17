package d_14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Kombinacija {
    private String idKombinacije;
    private ArrayList<Integer> nizBrojeva;

    public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.idKombinacije = idKombinacije;
        this.nizBrojeva = new ArrayList<>();
        this.nizBrojeva.add(jedan);
        this.nizBrojeva.add(dva);
        this.nizBrojeva.add(tri);
        this.nizBrojeva.add(cetiri);
        this.nizBrojeva.add(pet);
        this.nizBrojeva.add(sest);
        this.nizBrojeva.add(sedam);

    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public int getBroj (int index) {
        return this.nizBrojeva.get(index);
    }

    public boolean daLiJeIstaKombinacija (Kombinacija k) {
        for (int i = 0; i< this.nizBrojeva.size(); i++) {
            if(!this.nizBrojeva.get(i).equals(k.nizBrojeva.get(i))) {
                return false;
            }
        }

        return true;
    }

    public void stampaj () {
        System.out.println("ID: " + this.idKombinacije);
        System.out.println("brojevi: ");
        for (int i = 0; i < this.nizBrojeva.size(); i++) {
            System.out.print(this.nizBrojeva.get(i));
        }
    }
}
