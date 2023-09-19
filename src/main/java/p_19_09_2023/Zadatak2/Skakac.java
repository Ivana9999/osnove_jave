package p_19_09_2023.Zadatak2;

public class Skakac extends Atleticar{
    public Skakac(String imeIPrezime, int rezultat) {
        super(imeIPrezime, rezultat);
    }
    @Override
    public boolean boljiRezultatOd (Atleticar atleticar) {
        if (this.rezultat > atleticar.rezultat) {
            return true;
        } else {
            return false;
        }

    }
}


