package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Rating;

public class Episodes implements Rating {
    private int numberEpisode;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberEpisode() {
        return numberEpisode;
    }

    public void setNumberEpisode(int numberOfEpisode) {
        this.numberEpisode = numberOfEpisode;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
