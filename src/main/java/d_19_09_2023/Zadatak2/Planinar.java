package d_19_09_2023.Zadatak2;

import com.sun.source.tree.BreakTree;

public abstract class Planinar {
    protected int idBroj;
    protected String imeIPrezime;

    public Planinar(int idBroj, String imeIPrezime) {
        this.idBroj = idBroj;
        this.imeIPrezime = imeIPrezime;
    }

    public int getIdBroj() {
        return idBroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public abstract void stampaj ();
    public abstract double clanarina ();
    public abstract boolean uspesanUspon (Planina planina);
}
