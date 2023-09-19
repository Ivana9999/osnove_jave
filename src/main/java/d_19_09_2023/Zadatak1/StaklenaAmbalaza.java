package d_19_09_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean placanjeKaucije;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean placanjeKaucije, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placanjeKaucije = placanjeKaucije;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacanjeKaucije() {
        return placanjeKaucije;
    }

    public void setPlacanjeKaucije(boolean placanjeKaucije) {
        this.placanjeKaucije = placanjeKaucije;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vracaCenu() {
        if (this.placanjeKaucije) {
            return (this.osnovnaCena) * 1.2 + (this.kaucija);
        } else {
            return (osnovnaCena) * 1.2;

        }
    }

    @Override
    public void stampaj() {
        System.out.println("Kaucija za flasu: " + this.kaucija);
        System.out.println("Da li se za flasu placa kaucija: " + this.placanjeKaucije);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
