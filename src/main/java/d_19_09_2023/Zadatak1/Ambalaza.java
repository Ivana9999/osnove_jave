package d_19_09_2023.Zadatak1;

public abstract class Ambalaza {
    protected String barkod;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;

    }
    public Ambalaza () {

    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
    public double racunanjeTezine () {
       return this.brutoTezina - this.netoTezina;
        }
        public abstract double vracaCenu ();
    public abstract void stampaj ();

        }

