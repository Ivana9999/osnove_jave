package d_07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.ime = "Marko";
        student1.brojIndeksa = 32;
        student1.fakultet = "Fakultet bezbednosti";

        Student student2 = new Student();
        student2.ime = "Milica";
        student2.brojIndeksa = 24;
        student2.fakultet = "Fakultet tehnickih nauka";

         Student student3 = new Student();
        student3.ime = "Ivana";
        student3.brojIndeksa = 55;
        student3.fakultet = "Fakultet sporta i fizickog vspitanja";

        System.out.println("ime: " + student1.ime + "  broj indeksa: " + student1.brojIndeksa +  " fakultet: " +  student1.fakultet + ".");
        System.out.println("ime: " + student2.ime + "  broj indeksa: " + student2.brojIndeksa +  " fakultet: " +  student2.fakultet + ".");
        System.out.println("ime: " + student3.ime + "  broj indeksa: " + student3.brojIndeksa +  " fakultet: " +  student3.fakultet + ".");
    }
}
