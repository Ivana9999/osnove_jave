package p_19_09_2023.Zadatak1;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsinaOjekta, int zona) {
        super(adresa, povrsinaOjekta, zona);
    }
    @Override
    public double izracunajPorez () {
        return koeficijent() * this.povrsinaOjekta * 1.3;
    }
    @Override
    public void stampaj() {
        System.out.println("Lokal: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaOjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + this.izracunajPorez());
    }
}

