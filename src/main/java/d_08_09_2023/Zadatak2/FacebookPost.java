package d_08_09_2023.Zadatak2;

public class FacebookPost {
    public String imeIPrezimeKorisnikaObjavaPosta;
    public String imeIPrezimeKorisnikaNaKomJeObjavljenPost;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;




    public void like () {
        this.brojLajkova = this.brojLajkova + 1;

    }
    public void dislike () {
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova <0 ) {
            this.brojLajkova = 0;
        }
    }

    public void share () {
        this.brojDeljenja = this.brojDeljenja + 1;

    }
    public void stampaj () {
        System.out.println(this.imeIPrezimeKorisnikaObjavaPosta + " >>> " + "(" + this.imeIPrezimeKorisnikaNaKomJeObjavljenPost + ")");
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLajkova + " Shares " + this.brojDeljenja);
    }
}
