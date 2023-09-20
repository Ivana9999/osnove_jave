package d_18_09_2023.Zadatak1;

public class AudioControl extends Control{
    private boolean zvuk;

    public AudioControl(boolean zvuk) {
        this.zvuk = zvuk;
    }
    public AudioControl () {

    }

    public boolean isZvuk() {
        return zvuk;
    }

    public void setZvuk(boolean zvuk) {
        this.zvuk = zvuk;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if (this.zvuk) {
            double jacinaZvuka = player.getJacinaZvuka() + 1;
            if (jacinaZvuka >=100) {
                player.setJacinaZvuka(100);
            } else {
                player.setJacinaZvuka(jacinaZvuka);
            }
        } else {
            double jacinaZvuka = player.getJacinaZvuka() - 1;
            if (jacinaZvuka <=0) {
                player.setJacinaZvuka(0);
            } else {
                player.setJacinaZvuka(jacinaZvuka);
            }
        }
    }
}
