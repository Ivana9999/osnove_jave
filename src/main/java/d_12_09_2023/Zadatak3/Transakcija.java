package d_12_09_2023.Zadatak3;

public class Transakcija {
    private int idTransakcije;
    private Racun saKogSePrenoseSrdstva;
    private Racun naKojiSePrenoseSredstva;

    public Transakcija(int idTransakcije, Racun saKogSePrenoseSrdstva, Racun naKojiSePrenoseSredstva) {
        this.idTransakcije = idTransakcije;
        this.saKogSePrenoseSrdstva = saKogSePrenoseSrdstva;
        this.naKojiSePrenoseSredstva = naKojiSePrenoseSredstva;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getSaKogSePrenoseSrdstva() {
        return saKogSePrenoseSrdstva;
    }

    public void setSaKogSePrenoseSrdstva(Racun saKogSePrenoseSrdstva) {
        this.saKogSePrenoseSrdstva = saKogSePrenoseSrdstva;
    }

    public Racun getNaKojiSePrenoseSredstva() {
        return naKojiSePrenoseSredstva;
    }

    public void setNaKojiSePrenoseSredstva(Racun naKojiSePrenoseSredstva) {
        this.naKojiSePrenoseSredstva = naKojiSePrenoseSredstva;
    }


    public double racunaProviziju (double visinaTransakcije) {
        if (visinaTransakcije < 4500 ) {
            return 45.0;
        } else  {
            return visinaTransakcije * 0.01;
        }
    }
    public void izvrsiTransakciju (int trazenaSuma ) {

       saKogSePrenoseSrdstva.skiniSaRacuna(trazenaSuma + racunaProviziju(trazenaSuma));
       naKojiSePrenoseSredstva.uplatiNaRacun(trazenaSuma);

    }
    public void stampaj () {
        System.out.println("id transakcija: " + this.idTransakcije );
        System.out.println("Racun sa: " + this.saKogSePrenoseSrdstva.getImeIPrezime() + this.saKogSePrenoseSrdstva.getBrojRacuna());
        System.out.println("Racun na: " + this.naKojiSePrenoseSredstva.getImeIPrezime() + this.naKojiSePrenoseSredstva.getBrojRacuna());
    }
}
