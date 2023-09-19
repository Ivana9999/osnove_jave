package p_18_09_2023.Zadatak1;

public class StudentMaster extends Student{
    public StudentMaster(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    public double cenaSkolarine () {
        return 10000;
    }
    public boolean daLiJeNaBudeztu() {
        if (godinaStudija < 2) {
            return true;
        } else {
            return false;
        }
    }
}

