package p_15_09_2023;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double trenutnaSumaNovca, String brojKatice, int godinaVazenja, int mesec) {
        super(trenutnaSumaNovca, brojKatice, godinaVazenja, mesec);
    }

    public void transakcija (double proseldjenaSuma) {
        double provizija = proseldjenaSuma + (proseldjenaSuma * 1.5 / 100);
      super.izvrsiTransakciju(proseldjenaSuma);

    }
    public void naplatiOdrzavanje () {
        this.trenutnaSumaNovca -= 2;

    }
    @Override
    public void stampaj () {
        System.out.println("Master card: ");
        super.stampaj();
        System.out.println();
    }

}
