package d_11_09_2023.Zadatak1;

public class Autor {
    private String ime;
    private String prezime;



public Autor (String ime, String prezime) {
    this.ime = ime;
    this.prezime = prezime;

}
public String getIme () {
return ime;
}
public void setIme (String ime) {
    this.ime = ime;
}
public String getPrezime () {
        return prezime;
}
public void setPrezime (String prezime) {
    this.prezime = prezime;
}



public void stampaj () {
    System.out.println("Ime autora:" + "(" +   this.ime + ") " + "Prezime autora: " + "(" + this.prezime + ")");
}


}