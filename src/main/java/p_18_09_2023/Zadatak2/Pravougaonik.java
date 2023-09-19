package p_18_09_2023.Zadatak2;

public class Pravougaonik extends Figura{
    private double stranicaA;
    private double stranicaB;

    @Override
    public double povrsina() {
        return this.stranicaA * this.stranicaB;
    }

    @Override
    public double obim() {
        return (stranicaA + stranicaB) * 2;
    }

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }
}
