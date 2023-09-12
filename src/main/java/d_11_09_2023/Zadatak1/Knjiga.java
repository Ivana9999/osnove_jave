package d_11_09_2023.Zadatak1;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;


    public Knjiga(int isbn, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;

    }

    public int getIsbn () {
        return isbn;
    }
    public void setIsbn (int isbn) {
        this.isbn = isbn;
    }
    public String getNaziv () {
        return naziv;
    }
    public void setNaziv (String naziv) {
        this.naziv = naziv;
    }
    public int getGodinaIzdanja () {
        return godinaIzdanja;
    }
    public void setGodinaIzdanja (int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }
    public Autor getAutor () {
        return this.autor;
    }
    public void setAutor (Autor autor) {
        this.autor = autor;
    }
public void stampaj () {
    System.out.println("ISBN: " + "(" + this.isbn + ")");
    System.out.println("Naziv: " + "(" + this.naziv + ")" + " - " + "Godina izdanja: " + "(" + this.godinaIzdanja + ")");
    System.out.println("Autor: " + "(" + this.autor.getIme() + ")" + " " + "(" + this.autor.getPrezime() + ")");
}


}