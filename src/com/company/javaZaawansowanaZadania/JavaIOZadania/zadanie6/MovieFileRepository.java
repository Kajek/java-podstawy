package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MovieFileRepository {

    private final MovieParser movieParser = new MovieParser();
    private final static Path path = Paths.get("C:\\Users\\iT-Broker\\Desktop\\test.txt");

    public void addMovie(Movie movie) throws IOException {
        Files.writeString(path,movieParser.toCSV(movie), StandardOpenOption.APPEND);
    }

    public List<Movie> getAllMovies() throws IOException{
        List<String> movieLines = Files.readAllLines(path);
        List<Movie> movies = new ArrayList<>();
        for(String line : movieLines){
            Movie movie = movieParser.fromCSV(line);
            movies.add(movie);
        }
        return movies;
    }
}
