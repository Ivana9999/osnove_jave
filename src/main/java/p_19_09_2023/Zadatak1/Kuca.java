package p_19_09_2023.Zadatak1;

public class Kuca extends Objekat {
    private int brojClanova;

    public Kuca(String adresa, double povrsinaOjekta, int zona, int brojClanova) {
        super(adresa, povrsinaOjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double izracunajPorez() {
        return koeficijent() * this.povrsinaOjekta;
    }
    @Override
    public void stampaj() {
        System.out.println("Kuca: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaOjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Porez: " + this.izracunajPorez());
    }
}


