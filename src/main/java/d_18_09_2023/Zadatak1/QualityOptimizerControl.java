package d_18_09_2023.Zadatak1;

public class QualityOptimizerControl extends Control{
private double brzinaInterneta;
public QualityOptimizerControl () {

}

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        double kvalitetInterneta = this.brzinaInterneta * 10.1;
        if (kvalitetInterneta <= 144 ) {
            player.setKvalitetVidea(144);
        } else if (kvalitetInterneta >144 && kvalitetInterneta <= 240) {
            player.setKvalitetVidea(240);
        } else if (kvalitetInterneta > 240 && kvalitetInterneta <= 360) {
            player.setJacinaZvuka(360);
        } else if (kvalitetInterneta > 360 && kvalitetInterneta <=480) {
            player.setJacinaZvuka(480);
        } else if (kvalitetInterneta > 480 && kvalitetInterneta <=720) {
            player.setJacinaZvuka(720);
        } else {
            player.setJacinaZvuka(1080);
        }

    }
}
