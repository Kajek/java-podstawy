package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie4;

public class Movie extends MediaContent{

    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
