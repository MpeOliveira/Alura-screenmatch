package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The GodFather", 1972);
        meuFilme.rateTitles(10);
        Filme outroFilme = new Filme("Schindler's List", 1993);
        outroFilme.rateTitles(9.6);

        Serie sonsOfAnarchy = new Serie("Sons of Anarchy", 2008);
        sonsOfAnarchy.rateTitles(10);

        ArrayList<Titulo> watchedTitles = new ArrayList<>();
        watchedTitles.add(meuFilme);
        watchedTitles.add(outroFilme);
        watchedTitles.add(sonsOfAnarchy);

        for (Titulo item: watchedTitles) {
            System.out.println(item.getNome());

            if (item instanceof Filme film && film.getRating() > 2) {
                System.out.println("Classification: " + film.getRating());
            }
        }
    }
}
