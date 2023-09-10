package d_07_09_2023.Zadatak6;

public class Zadatak6 {
//    Upravljanje Flotom Vozila - Rešite Poslovni Problem
//
//    Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila. Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//    Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//
//    Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//    Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//    Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.

    public static void main(String[] args) {

        RuteZaDostavu ruta = new RuteZaDostavu();

        Vozila vozila = new Vozila();

        Vozaci vozaci = new Vozaci();

        StatusDostave status = new StatusDostave();



    }
}
