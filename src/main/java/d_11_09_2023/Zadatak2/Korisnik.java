package d_11_09_2023.Zadatak2;

public class Korisnik {
    private String ime;
    private String prezime;


    public Korisnik (String ime, String Prezime) {
        this.ime = ime;
        this.prezime = prezime;

    }
public String getIme() {
        return ime;
}
public void setIme (String ime) {
        this.ime = ime;
}
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

}
