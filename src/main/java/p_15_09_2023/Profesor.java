package p_15_09_2023;

public class Profesor extends Osoba{
    private String predmet;
    private double iznosPlate;

    public Profesor(String predmet, double iznosPlate) {
        this.predmet = predmet;
        this.iznosPlate = iznosPlate;
    }
    public Profesor () {

    }
    public void povecajPlatu (double procenatPovecanja) {
        iznosPlate = iznosPlate + iznosPlate * (procenatPovecanja / 100);
    }
    public void stampaj () {
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.iznosPlate);
        System.out.println();
    }

}
