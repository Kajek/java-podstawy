package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie4;

public class TvShow extends MediaContent{

    private int numberOfEpisodes;

    public TvShow(String title, int numberOfEpisodes) {
        super(title);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String toString() {
        return "TvShow{" +
                "title=" + title +
                "numberOfEpisodes=" + numberOfEpisodes +
                '}';
    }
}
