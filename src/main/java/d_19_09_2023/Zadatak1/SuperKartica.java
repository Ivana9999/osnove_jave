package d_19_09_2023.Zadatak1;

public class SuperKartica{
   private int brojKartice;
   private String imeIPrezime;
   private int popust;
public SuperKartica () {

}
    public SuperKartica(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, int brojKartice, String imeIPrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezime = imeIPrezime;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

  public void stampaj() {
      System.out.println("(" + this.brojKartice + "), " + "(" + this.imeIPrezime + ")");

  }
    }

