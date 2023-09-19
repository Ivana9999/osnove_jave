package p_15_09_2023;

public class VisaKartica extends PlatnaKartica{
    private String imeIPrezimeOvlasceneOsobe;

    public String getImeIPrezimeOvlasceneOsobe() {
        return imeIPrezimeOvlasceneOsobe;
    }

    public void setImeIPrezimeOvlasceneOsobe(String imeIPrezimeOvlasceneOsobe) {
        this.imeIPrezimeOvlasceneOsobe = imeIPrezimeOvlasceneOsobe;
    }

    public VisaKartica(double trenutnaSumaNovca, String brojKatice, int godinaVazenja, int mesec, String imeIPrezimeOvlasceneOsobe) {
        super(trenutnaSumaNovca, brojKatice, godinaVazenja, mesec);
        this.imeIPrezimeOvlasceneOsobe = imeIPrezimeOvlasceneOsobe;
    }
    public void izvrsiTransakciju (double suma) {
        double provizija = suma * 1.8 / 100;
        if (suma < 4) {
            super.izvrsiTransakciju(4);

        } else {
            super.izvrsiTransakciju(suma + provizija);
        }

    }
    @Override
    public void stampaj () {
        System.out.println("Visa card: ");
        super.stampaj();
    }
}
