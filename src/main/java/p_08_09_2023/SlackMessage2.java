package p_08_09_2023;

 public class SlackMessage2 {

    public String tekstPoruke;

    public String imeIPrezime;

    public String datumIVreme;

    public void stampaj() {
        System.out.println(this.imeIPrezime + " " + this.datumIVreme);
        System.out.println(this.tekstPoruke);

    }
  public void azuriranje (String tekst, String datum) {
        this.tekstPoruke = tekst;
        this.datumIVreme= datum;

  }
}

