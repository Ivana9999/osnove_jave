package p_12_09_2023;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;




    public ZoomCall (String linkZaPoziv, String password, Korisnik korisnikHost) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = korisnikHost;
    }
    public ZoomCall (String linkZaPoziv, String password, Korisnik korisnikHost, Korisnik korisnikGuest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = korisnikHost;
        this.guest = korisnikGuest;

    }

    public void setGuest(Korisnik korisnikGuestk) {
        this.guest = korisnikGuestk;
    }
    public String getLinkZaPoziv () {
        return linkZaPoziv;
    }
    public String getPassword () {
        return password;
    }
    public Korisnik getHost() {
        return host;
    }
    public Korisnik getGuest() {
        return guest;
    }
    public void stampaj () {
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        System.out.println("Guest: " + this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je: " + this.host.maksimalnaDuzinaTrajanja());

    }
}
