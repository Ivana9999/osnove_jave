package p_18_09_2023.Zadatak2;

public class FigureGenerator {
    public Figura generisatiFiguru(String tipFigure) {

        if (tipFigure.equals("trougao")) {
            return new JednakotranicniTrougao(5);
        } else if (tipFigure.equals("pravougaonik")) {

            return new Pravougaonik(5, 10);

        }
        return null;
    }

}
