package Prvi_Test_Java;

public class Zadatak4 {
//    Napišite metode koje omogućavaju pakovanje teksta u HTML elemente. Prva metoda, kao parametre,
//    prima tekst i tip, a vraća HTML element (String) s prosleđenim tekstom. Metoda podržava sledeće tipove:
//
//     - "bold": Metoda pakuje tekst u <b>prosleđeni tekst</b>.
//     - "italic": Metoda pakuje tekst u <em>prosleđeni tekst</em>.
//     - "paragraph": Metoda pakuje tekst u <p>prosleđeni tekst</p>.
//
//    Ako se prosledi tip koji nije podržan, vraća se neupakovan tekst, tj.
//    vraća se takav kakav je bio prosleđen metodi.
//
//    Druga metoda služi za kreiranje HTML anchor taga.
//    Metoda kao parametre prima link i tekst koji treba da bude linkovan.
//    Metoda vraća tekst u formatu <a href=prosleđeniLink>Prosleđeni tekst</a>.
//
//    U glavnom programu, koristeći kreirane metode, napišite program koji prikazuje sledeći tekst:
//    <a href=google.com>Welcome to Google</a>
//    <b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//    <p>Naravno samo je falio paragraf</p>

    public static void main(String[] args) {
        System.out.println(kreiranjeHTMLanchor("Welcome to Google", "google.com"));
        System.out.print(pakovanjeTeksta("Ovaj deo je bold", "bold"));
        System.out.print(pakovanjeTeksta("ovo je italic", "italic"));
        System.out.println("");
        System.out.println(pakovanjeTeksta("Naravno samo je falio paragraf","paragraph"));
    }

    public static String pakovanjeTeksta (String tekst, String tip) {
        if(tip.equals("bold")) {
            return "<b>"+tekst+"</b>";
        } else if (tip.equals("italic")) {
            return "<em>"+tekst+"</em";
        } else if (tip.equals("paragraph")) {
            return "<p>"+tekst+"</p>";
        } else {
            return tekst;
        }
    }

    public static String kreiranjeHTMLanchor (String tekst, String link){
        return "<a href="+link+">"+tekst+"</a>";
    }
}
