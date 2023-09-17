package d_15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
private int brojIgrac;
private String pozicija;
private ArrayList<Karton> kartoni;
private boolean kapiten;
public Igrac () {

}

    public Igrac(String imeIPrezime,int jmbg, int godinaRodjenja, int brojIgrac, String pozicija, boolean kapiten) {
    super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojIgrac = brojIgrac;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
    }

    public int getBrojIgrac() {
        return brojIgrac;
    }

    public void setBrojIgrac(int brojIgrac) {
        this.brojIgrac = brojIgrac;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public ArrayList<Karton> getKartoni() {
        return kartoni;
    }

    public void setKartoni(ArrayList<Karton> kartoni) {
        this.kartoni = kartoni;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
  public void dodajKaton (Karton karton) {
    this.kartoni.add(karton);
  }
  public int vracaBrojZutihKatona () {
    int brojKartona = 0;
    for (int i = 0; i < this.kartoni.size(); i++) {
        if (this.kartoni.get(i).getTipKartona().equals("zuti")) {
            brojKartona ++;
        }
   }
    return brojKartona;

  }
    public int vracaBrojCrvenihKatona () {
        int brojKartona = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTipKartona().equals("crveni")) {
                brojKartona ++;
            }
        }
        return brojKartona;

    }
    public void stampaj () {
    super.stampaj();
        System.out.println("Broj igraca: "  + this.brojIgrac + " Pozicija: " + this.pozicija + " Kapiten: " + this.kapiten);

        }
     }



