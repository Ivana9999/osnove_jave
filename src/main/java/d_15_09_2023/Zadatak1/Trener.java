package d_15_09_2023.Zadatak1;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public Trener (String imeIPrezime, int jmng, int godinaRodjenja, int godineIskustva, String tipTrenera ) {
super(imeIPrezime, jmng, godinaRodjenja);
this.godineIskustva = godineIskustva;
this.tipTrenera = tipTrenera;
    }
    public void stampaj () {
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva + " Tip Trenera: " + this.tipTrenera);
    }
}
