package d_08_09_2023.Zadatak1;

public class Proizvod {
    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvoda;





    public void stampaj() {
        System.out.println("{{" +  this.nazivProizvoda  + "}}, " + "{{" + this.cenaProizvoda  + "}}, " + "{{" + this.tezinaProizvoda + "}}");

    }
    public void povecajCenu (double povecanje) {
        this.cenaProizvoda += povecanje;

    }
    public double vratiCenuSaPopustom (double popust) {

        if (popust >=0 && popust <=100) {
            return this.cenaProizvoda - (popust / 100) * this.cenaProizvoda;

        }
return 0.0;
    }
public int racunajPostarinu () {

        if (this.tezinaProizvoda <=100) {
            return 200;

        } else if (this.tezinaProizvoda >=101 && this.tezinaProizvoda <=500) {
            return 400;

        } else if (this.tezinaProizvoda >500) {
            return 1000;
        }
return 0;

}


}
