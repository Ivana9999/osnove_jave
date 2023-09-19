package p_18_09_2023.Zadatak1;

public class StudentOsnovnih extends Student{


    public StudentOsnovnih(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    public double cenaSkolarine () {
        return 9000;
    }
    public boolean daLiJeNaBudeztu() {
        if (godinaStudija < 5) {
            return true;
        } else {
            return false;
        }
    }

}
