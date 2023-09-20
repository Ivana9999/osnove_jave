package d_19_09_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar {
    private int kg;
    private String nazivOkruga;
    private double maksimalniUspon;

    public RekreativniPlaninar(int idBroj, String imeIPrezime, int kg, String nazivOkruga, double maksimalniUspon) {
        super(idBroj, imeIPrezime);
        this.kg = kg;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    public int getKg() {
        return kg;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaksimalniUspon() {
        return maksimalniUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.idBroj);
        System.out.println("ime: " + this.imeIPrezime);
        System.out.println("Okrug: " + this.nazivOkruga);

    }

    @Override
    public double clanarina() {
        return 1000;

    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (this.maksimalniUspon < planina.getVisinaPlanine()- this.kg * 50) {

            return true;
        } else {
            return false;
        }
}

    }


