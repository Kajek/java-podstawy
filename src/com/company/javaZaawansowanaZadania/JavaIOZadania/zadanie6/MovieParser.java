package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie6;

public class MovieParser {

    private static final String separator = ",";

    public Movie fromCSV(String csvLine){
        String [] data = csvLine.split(",");
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]) );
    }

    public String toCSV(Movie movie){
        return new StringBuilder().append(movie.getTitle())
                .append(separator)
                .append(movie.getDirector())
                .append(separator)
                .append(movie.getGenre())
                .append(separator)
                .append(movie.getYearOfRelease())
                .append("\n")
                .toString();
    }
}
