package p_19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDisicpline;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String imeDiscipline, String tipDisicpline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDisicpline = tipDisicpline;
        this.atleticari = new ArrayList<>();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDisicpline() {
        return tipDisicpline;
    }

    public void setTipDisicpline(String tipDisicpline) {
        this.tipDisicpline = tipDisicpline;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
    public void diskvalifikujAtleticara (String imeIPrezime) {
        for (int i = 0; i < atleticari.size(); i++) {
            if (this.atleticari.get(i).getImeIPrezime().equals(imeIPrezime)) {
                this.atleticari.remove(i);
            }
        }
    }
    private Atleticar najboljiRezultat () {
            Atleticar najbolji = this.atleticari.get(0);
            for (int i = 0; i < this.atleticari.size(); i++) {
                if (najbolji.rezultat < this.atleticari.get(i).rezultat) {
                    najbolji = this.atleticari.get(i);
                }
            }
            return najbolji;
    }
    public void stampajPobednika () {
        System.out.println("Pobednik discipline: " + this.najboljiRezultat().getImeIPrezime());

    }
    public void dodajAtleticara (Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }
}
