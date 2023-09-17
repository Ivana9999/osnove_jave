package d_14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {
private int brojIndeksa;
private String imeIPrezime;
private String tipStudija;
private ArrayList<Ispit> ispiti;

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();

    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit (Ispit ispit) {
        this.ispiti.add(ispit);

    }
    private double prosek () {
        double zbirOcena = 0.0;
        int brojPolazenihIspita = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()) {
                zbirOcena += this.ispiti.get(i).getOcena();
                brojPolazenihIspita++;
            }
        }
         return zbirOcena / brojPolazenihIspita;
    }
    public void stampaj () {
        System.out.println("(" + this.brojIndeksa + ") - " + " (" + this.imeIPrezime + ") - " + " (" + this.tipStudija + ")" );
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();

        }
        System.out.println("Prosecna ocena:  " + " (" + this.prosek() + ")");

    }
}
