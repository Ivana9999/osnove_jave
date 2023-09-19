package p_18_09_2023.Zadatak2;

public  class JednakotranicniTrougao extends Figura {
    private double stranicaA;

    public JednakotranicniTrougao(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public  double povrsina() {
return (this.stranicaA * this. stranicaA) * 1.73205 / 4;
    }


    @Override
    public  double obim() {
     return  3 * stranicaA;
    }
}
