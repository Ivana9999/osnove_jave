package p_15_09_2023;

public class Student extends Osoba{
    private int brojIndeksa;
    private int dugZaSkolarinu;

    public Student(int brojIndeksa, int dugZaSkolarinu) {
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public Student () {

    }
    public void uplatiZaSkolarinu (int iznosUplate) {
        this.dugZaSkolarinu = this.dugZaSkolarinu - iznosUplate;

    }
    public void stampaj () {
        super.stampaj();
        System.out.println("Indeks: " + this.brojIndeksa);
        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);

    }
}
