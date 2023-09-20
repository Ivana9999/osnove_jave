package d_18_09_2023.Zadatak1;

public class VideoPlayer {
    protected double duzinaVidea;
    protected double trenutnoVreme;
    protected double jacinaZvuka;
    protected int kvalitetVidea;

    public VideoPlayer(double duzinaVidea, double trenutnoVreme, double jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public double getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(double jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj () {
        System.out.println(this.jacinaZvuka);
        System.out.println(this.kvalitetVidea);
    }
}
