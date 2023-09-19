package p_15_09_2023;

public abstract class PlatnaKartica {
    protected double trenutnaSumaNovca;
    protected String brojKatice;
    protected int godinaVazenja;
    protected int mesec;

    public PlatnaKartica(double trenutnaSumaNovca, String brojKatice, int godinaVazenja, int mesec) {
        this.trenutnaSumaNovca = trenutnaSumaNovca;
        this.brojKatice = brojKatice;
        this.godinaVazenja = godinaVazenja;
        this.mesec = mesec;
    }

    public double getTrenutnaSumaNovca() {
        return trenutnaSumaNovca;
    }

    public String getBrojKatice() {
        return brojKatice;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesec() {
        return mesec;
    }
    public void dodajSredstva (double unetaVrednost) {
        this.trenutnaSumaNovca += this.trenutnaSumaNovca + unetaVrednost;

    }
    public void izvrsiTransakciju (double prosledjenaVrednost) {
        this.trenutnaSumaNovca -=  prosledjenaVrednost;

    }
    public void stampaj () {
        System.out.println(this.brojKatice + ", " + this.godinaVazenja + ", " + this.trenutnaSumaNovca);

    }

}
