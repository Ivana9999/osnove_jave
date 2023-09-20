package d_19_09_2023.Zadatak2;

public class Alpinista extends Planinar{
    private int poeni;

    public Alpinista(int idBroj, String imeIPrezime, int poeni) {
        super(idBroj, imeIPrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Aplpinista, id: " + this.idBroj);
        System.out.println("ime: " + this.imeIPrezime);
        System.out.println("Broj poena: " + this.poeni);

    }

    @Override
    public double clanarina() {
        return 1500 - this.poeni * 50;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine()<= 4000) {
            return true;
        } else {
            return false;

        }
    }
}
