package br.com.alura.screenmatch.services;

import br.com.alura.screenmatch.calculos.Rating;

public class FilterRecomendation {

    public void filters(Rating rating) {
        if (rating.getRating() >= 4) {
            System.out.println("This is among the favorites of the moment");
        } else if (rating.getRating() >= 2) {
            System.out.println("Well rated at the moment");
        } else {
            System.out.println("Add to list to watch later");
        }
    }
}
