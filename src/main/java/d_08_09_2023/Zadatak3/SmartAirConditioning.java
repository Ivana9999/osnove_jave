package d_08_09_2023.Zadatak3;

public class SmartAirConditioning {
    public String markaKlime;
    public double potrosnjaElekEnergijeDokHladi;
    public double potrosnjaElekEnergijeDokGreje;
    public int temperatura;
    public String mod;


    public void stampaj () {
        System.out.println(this.markaKlime + " - " +  this.mod + " - " + this.temperatura);
    }

   public double mesecnaPotrosnja () {

        if(this.mod.equals("Greje")) {
            return 30 * 15 * this.potrosnjaElekEnergijeDokHladi;
        } else if (this.mod.equals("Hladi")) {
return 30 * 15 * this.potrosnjaElekEnergijeDokGreje;
        }

        return 0.0;
   }

   public double potrosnjaZaMesecDana (double mesecnaPotrosnja) {

    if(mesecnaPotrosnja <= 350) {
        return mesecnaPotrosnja * 6.0;
    } else {
        return (350 * 6.0) + ((mesecnaPotrosnja - 350) * 9);
    }

   }

   }

