package d_18_09_2023.Zadatak1;

public class TimeControl extends Control {
 private boolean pomeranjeTrenutnoVremeVideaUnapred;

    public TimeControl(boolean pomeranjeTrenutnoVremeVideaUnapred) {
        this.pomeranjeTrenutnoVremeVideaUnapred = pomeranjeTrenutnoVremeVideaUnapred;
    }

    public boolean isPomeranjeTrenutnoVremeVideaUnapred() {
        return pomeranjeTrenutnoVremeVideaUnapred;
    }

    public void setPomeranjeTrenutnoVremeVideaUnapred(boolean pomeranjeTrenutnoVremeVideaUnapred) {
        this.pomeranjeTrenutnoVremeVideaUnapred = pomeranjeTrenutnoVremeVideaUnapred;
    }
    public TimeControl () {

    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if (this.pomeranjeTrenutnoVremeVideaUnapred) {


            double duzinaVidea = player.getTrenutnoVreme() + 15;

            if (duzinaVidea >= player.getDuzinaVidea()) {
                player.setTrenutnoVreme(player.getDuzinaVidea());
            } else {
                player.setTrenutnoVreme(duzinaVidea);
            }


        } else {
            double duzinaVidea = player.getTrenutnoVreme() - 15;
            if (duzinaVidea <= 0 ) {
                player.setTrenutnoVreme(0);
            } else {
                player.setTrenutnoVreme(duzinaVidea);
            }
        }




        }
}

