package p_19_09_2023.Zadatak1;

public  class Zgrada extends Objekat {
    private int brojStanova;

    public Zgrada(String adresa, double povrsinaOjekta, int zona, int brojStanova) {
        super(adresa, povrsinaOjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double izracunajPorez() {
        return koeficijent() * this.povrsinaOjekta * this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Zgrada: ");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaOjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojStanova);
        System.out.println("Porez: " + this.izracunajPorez());
    }
}