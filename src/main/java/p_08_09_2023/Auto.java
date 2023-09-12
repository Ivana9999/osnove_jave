package p_08_09_2023;

public class Auto {

    public String imeIPrezime;
    public String markaAuta;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikazaAuta;
    public String brojRegistracije;
    public boolean klima;
    public int maksimalnaBrzina;


    public void stampaj() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.markaAuta + " - " + this.brojVrata + " -ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100 km ");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina ");

    }

    public boolean prekoracenjeBrzine(int ogranicenje) {

        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        }
        return false;
    }

    public int visinanovcanaKazna(int ogranicenje) {

        if (this.trenutnaBrzina > ogranicenje) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;

        }
        return 0;
    }

    public boolean oldtajmer() {

        if (this.godinaProizvodnje < 1950) {
            return true;
        }
        return false;

    }

    public boolean istekRegistracije(int trenutniMesec) {

        if (this.mesecRegistracije < trenutniMesec) {
            return true;
        }
        return false;
    }

    public double cenaRegistracije() {

        if (this.kubikazaAuta <= 2000) {
            return this.kubikazaAuta * 100;
        } else {
            return this.kubikazaAuta * 100 + (this.kubikazaAuta * 100) * 0.3;
//            moze i na drugi nacin:
//            double cenaRegistracije = this.kubikazaAuta * 100;
//            if (this.kubikazaAuta > 2000) {
//                cenaRegistracije = cenaRegistracije *1.3;
//            }

        }

    }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        if (this.trenutnaBrzina > this.maksimalnaBrzina) {
            this.trenutnaBrzina = this.maksimalnaBrzina;
        }

    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina < 0) {
            this.trenutnaBrzina = 0;
        }
    }
        public double trenutnaPorosnja () {
            double faktorKlime = 1.0;
            if (this.klima) {
                faktorKlime = 1.2;
            }
            return this.trenutnaBrzina / 100.0 * this.potrosnja * faktorKlime;

        }



        public void stampajTablu () {
      int crtice = this.trenutnaBrzina * 100 / this.maksimalnaBrzina;
      for (int i = 0; i < 100; i ++) {
          if ( i < crtice) {
              System.out.println("|");
          } else {
              System.out.println(".");
          }
      }
            System.out.println(this.trenutnaBrzina + " / " + this.maksimalnaBrzina + "km/h");
    }

}




