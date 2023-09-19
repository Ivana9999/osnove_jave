package p_19_09_2023.Zadatak1;

public abstract class Objekat {
    protected String adresa;
    protected double povrsinaOjekta;
    protected int zona;

    public Objekat(String adresa, double povrsinaOjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaOjekta = povrsinaOjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaOjekta() {
        return povrsinaOjekta;
    }

    public void setPovrsinaOjekta(double povrsinaOjekta) {
        this.povrsinaOjekta = povrsinaOjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    public double koeficijent () {
        if (this.zona == 1) {
            return 1.4;
        } else if (this.zona == 2) {
            return 1.1;

        } else {
            return 1.05;
        }
    }
    public abstract double izracunajPorez ();


    public abstract void stampaj();
}
